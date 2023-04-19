package com.tasleem.driver;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.location.Location;
import android.os.Build;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;

import com.tasleem.driver.models.responsemodels.ProviderLocationResponse;
import com.tasleem.driver.models.responsemodels.WaitingTimeResponse;
import com.tasleem.driver.models.singleton.CurrentTrip;
import com.tasleem.driver.parse.ApiClient;
import com.tasleem.driver.roomdata.DataLocationsListener;
import com.tasleem.driver.roomdata.DataModificationListener;
import com.tasleem.driver.roomdata.DatabaseClient;
import com.tasleem.driver.utils.AppLog;
import com.tasleem.driver.utils.Const;
import com.tasleem.driver.utils.NetworkHandler;
import com.tasleem.driver.utils.PreferenceHelper;
import com.tasleem.driver.utils.SocketHelper;
import com.tasleem.driver.utils.Utils;
import org.xms.g.location.FusedLocationProviderClient;
import org.xms.g.location.LocationCallback;
import org.xms.g.location.LocationRequest;
import org.xms.g.location.LocationResult;
import org.xms.g.location.LocationServices;
import org.xms.g.tasks.OnSuccessListener;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import io.socket.client.Ack;
import io.socket.client.Socket;
import io.socket.emitter.Emitter;

/**
 * Created by elluminati on 24-06-2016.
 */
public class EberUpdateService extends Service {
    private static final String CHANNEL_ID = "eberlocation2019";
    private static final Long INTERVAL = 5000L; // millisecond
    private static final Long FASTEST_INTERVAL = 4000L; // millisecond
    private static final Float DISPLACEMENT = 5f; // millisecond
    private final LocationRequest locationRequest = LocationRequest.create().setInterval(INTERVAL).setFastestInterval(FASTEST_INTERVAL).setSmallestDisplacement(DISPLACEMENT).setPriority(LocationRequest.getPRIORITY_HIGH_ACCURACY());
    private static final Long INTERVAL_WAITING_TIME_IN_TRIP = 10000L; // millisecond
    private static final Long FASTEST_INTERVAL_WAITING_TIME_IN_TRIP = 8000L; // millisecond
    private static final Long MAX_WAITING_TIME_IN_TRIP = 30000L; // millisecond
    private static final float MIN_MOVEMENT_DISTANCE = 20; // 30 meters
    private long endWaitingTime = 0;
    private final LocationRequest locationRequestForWaitingTimeInTrip =
            LocationRequest.create().setMaxWaitTime(MAX_WAITING_TIME_IN_TRIP).setInterval(INTERVAL_WAITING_TIME_IN_TRIP).setFastestInterval(FASTEST_INTERVAL_WAITING_TIME_IN_TRIP).setPriority(LocationRequest.getPRIORITY_HIGH_ACCURACY());
    public String TAG = EberUpdateService.class.getSimpleName();
    private PreferenceHelper preferenceHelper;
    private Location currentLocation;
    private Location lastLocation;
    // this use to know if the driver stopped or not in waiting time in trip
    private Location previousLocation;
    private ServiceReceiver serviceReceiver;
    private SocketHelper socketHelper;
    private boolean isWaitForLocationUpdate;
    private NetworkHandler networkHandler;
    private final LocationCallback locationCallback = new LocationCallback() {
        @Override
        public void onLocationResult(LocationResult locationResult) {
            super.onLocationResult(locationResult);
            if (locationResult != null) {
                Log.d("locationCallback : ", " min");
                currentLocation = locationResult.getLastLocation();
                if (!SocketHelper.getInstance(preferenceHelper.getProviderId()).isConnected() || (lastLocation != null && currentLocation != null && (currentLocation.getTime() - lastLocation.getTime()) > 10 * 1000)) {
                    isWaitForLocationUpdate = false;
                }
                if (networkHandler.isNetworkAvailable()) {
                    if (!socketHelper.isConnected()) {
                        SocketHelper.getInstance(preferenceHelper.getProviderId()).socketConnect();
                    }
                }
                if (!isWaitForLocationUpdate) {
                    updateLocation();
                }
            }
        }
    };

    private final LocationCallback locationWaitingTimeCallback = new LocationCallback() {
        @Override
        public void onLocationResult(LocationResult locationResult) {
            super.onLocationResult(locationResult);
            if (locationResult != null) {

                if (networkHandler.isNetworkAvailable()) {
                    if (!socketHelper.isConnected()) {
                        SocketHelper.getInstance(preferenceHelper.getProviderId()).socketConnect();
                    }
                }

                if (preferenceHelper.getSessionToken() != null) {
                    if (preferenceHelper.getIsHaveTrip() && preferenceHelper.getIsTripStared()) {
                        for (Location location : locationResult.getLocations()) {
                            if (previousLocation != null && location.distanceTo(previousLocation) <= MIN_MOVEMENT_DISTANCE) {
                                if (preferenceHelper.getStartTimeInTripWaitingTime() == 0) {
                                    preferenceHelper.putStartTimeInTripWaitingTime(System.currentTimeMillis());
                                    Log.d("startWaitingTime : ", preferenceHelper.getStartTimeInTripWaitingTime() + " min");
                                }
                            } else if (preferenceHelper.getStartTimeInTripWaitingTime() != 0) {
                                endWaitingTime = System.currentTimeMillis();

                                long waitingTime = (endWaitingTime - preferenceHelper.getStartTimeInTripWaitingTime()) / 60000;
                                Log.d("Waiting Time : ", waitingTime + " min");

                                providerWaitingTimeUpdateWhenTrip(preferenceHelper.getTripId(), preferenceHelper.getStartTimeInTripWaitingTime(), endWaitingTime);

                                endWaitingTime = 0;
                                preferenceHelper.putStartTimeInTripWaitingTime(0);
                            }
                            previousLocation = location;
                        }
                    } else {
                        endWaitingTime = 0;
                        preferenceHelper.putStartTimeInTripWaitingTime(0);
                    }
                }
            }
        }
    };

    private final Emitter.Listener onConnect = new Emitter.Listener() {
        @Override
        public void call(Object... args) {
            updateLocation();
        }
    };
    private FusedLocationProviderClient fusedLocationProviderClient;
    private FusedLocationProviderClient fusedLocationWaitingTimeInTrip;

    @Override
    public void onCreate() {
        super.onCreate();
        fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(EberUpdateService.this);
        fusedLocationWaitingTimeInTrip = LocationServices.getFusedLocationProviderClient(EberUpdateService.this);
        startForeground(Const.FOREGROUND_NOTIFICATION_ID, getNotification(getResources().getString(R.string.app_name)));
        preferenceHelper = PreferenceHelper.getInstance(this);
        serviceReceiver = new ServiceReceiver();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(Const.ACTION_ACCEPT_NOTIFICATION);
        intentFilter.addAction(Const.ACTION_CANCEL_NOTIFICATION);
        registerReceiver(serviceReceiver, intentFilter);
        initNetworkManager();
        socketHelper = SocketHelper.getInstance(preferenceHelper.getProviderId());
        socketHelper.getSocket().on(Socket.EVENT_CONNECT, onConnect);
        socketHelper.socketConnect();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        if (intent != null && intent.getAction() != null) {
            if (intent.getAction().equals(Const.Action.START_FOREGROUND_ACTION)) {
                checkPermission();
                fusedLocationProviderClient.getLastLocation().addOnSuccessListener(new OnSuccessListener<Location>() {
                    @Override
                    public void onSuccess(Location location) {
                        if (location != null) {
                            currentLocation = location;
                        }
                    }
                });
            }
        }
        return START_STICKY;
    }

    private void checkPermission() {
        if (ContextCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_COARSE_LOCATION) == PackageManager.PERMISSION_GRANTED && ContextCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED) {
            addLocationListener();
        }
    }

    @SuppressLint("MissingPermission")
    private void addLocationListener() {
        fusedLocationProviderClient.requestLocationUpdates(locationRequest, locationCallback, null);
        fusedLocationWaitingTimeInTrip.requestLocationUpdates(locationRequestForWaitingTimeInTrip, locationWaitingTimeCallback, null);
    }

    private void removeLocationListener() {
        fusedLocationProviderClient.removeLocationUpdates(locationCallback);
        fusedLocationWaitingTimeInTrip.removeLocationUpdates(locationWaitingTimeCallback);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        unregisterReceiver(serviceReceiver);
        removeLocationListener();
        SocketHelper socketHelper = SocketHelper.getInstance(preferenceHelper.getProviderId());
        if (socketHelper != null) {
            if (!preferenceHelper.getIsHaveTrip()) {
                socketHelper.getSocket().off();
            }
        }
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    private void providerLocationUpdateWhenTrip(String tripId) {
        if (currentLocation != null) {
            final JSONObject jsonObject = new JSONObject();
            try {
                jsonObject.put(Const.Params.PROVIDER_ID, preferenceHelper.getProviderId());
                jsonObject.put(Const.Params.TOKEN, preferenceHelper.getSessionToken());
                jsonObject.put(Const.Params.LATITUDE, String.valueOf(currentLocation.getLatitude()));
                jsonObject.put(Const.Params.LONGITUDE, String.valueOf(currentLocation.getLongitude()));
                if (lastLocation != null) {
                    jsonObject.put(Const.Params.BEARING, currentLocation.bearingTo(lastLocation));
                } else {
                    jsonObject.put(Const.Params.BEARING, 0);
                }
                jsonObject.put(Const.Params.TRIP_ID, tripId);
                jsonObject.put(Const.Params.LOCATION_UNIQUE_ID, preferenceHelper.getIsHaveTrip() ? preferenceHelper.getLocationUniqueId() : 0);
                Log.d("Location_driver ", networkHandler.isNetworkAvailable() + " " + socketHelper.isConnected());
                if (networkHandler.isNetworkAvailable() && socketHelper.isConnected()) {
                    setLastLocation(currentLocation);
                    DatabaseClient.getInstance(this).insertLocation(currentLocation.getLatitude(), currentLocation.getLongitude(), preferenceHelper.getLocationUniqueId(), new DataModificationListener() {
                        @Override
                        public void onSuccess() {
                            Log.d("Location_driver ", "insertLocation to local DB");
                            DatabaseClient.getInstance(EberUpdateService.this).getAllLocation(new DataLocationsListener() {
                                @Override
                                public void onSuccess(JSONArray locations) {
                                    try {
                                        Log.d("Location_driver ", "added location to local DB");
                                        jsonObject.put(Const.google.LOCATION, locations);
                                        updateLocationUsingSocket(jsonObject);
                                    } catch (JSONException e) {
                                        AppLog.handleException(TAG, e);
                                    }
                                }
                            });
                        }
                    });


                } else {
                    if (!TextUtils.isEmpty(tripId) && !locationMatch(lastLocation, currentLocation)) {
                        DatabaseClient.getInstance(this).insertLocation(currentLocation.getLatitude(), currentLocation.getLongitude(), preferenceHelper.getLocationUniqueId(), new DataModificationListener() {
                            @Override
                            public void onSuccess() {
                                setLastLocation(currentLocation);
                            }
                        });
                    }
                }
            } catch (JSONException e) {
                AppLog.handleException(TAG, e);
            }
        }

    }

    private void providerLocationUpdateNoTrip() {
        if (currentLocation != null) {
            JSONObject jsonObject = new JSONObject();
            try {
                jsonObject.put(Const.Params.PROVIDER_ID, preferenceHelper.getProviderId());
                jsonObject.put(Const.Params.TOKEN, preferenceHelper.getSessionToken());
                jsonObject.put(Const.Params.LATITUDE, String.valueOf(currentLocation.getLatitude()));
                jsonObject.put(Const.Params.LONGITUDE, String.valueOf(currentLocation.getLongitude()));
                if (lastLocation != null) {
                    jsonObject.put(Const.Params.BEARING, currentLocation.bearingTo(lastLocation));
                }
                jsonObject.put(Const.Params.TRIP_ID, "");
                jsonObject.put(Const.Params.LOCATION_UNIQUE_ID, 0);

                JSONArray location = new JSONArray();
                location.put(currentLocation.getLatitude());
                location.put(currentLocation.getLongitude());
                location.put(System.currentTimeMillis());
                JSONArray locationJSONArray = new JSONArray();
                jsonObject.put(Const.google.LOCATION, locationJSONArray.put(location));
                setLastLocation(currentLocation);
                updateLocationUsingSocket(jsonObject);
            } catch (JSONException e) {
                AppLog.handleException(TAG, e);
            }
        }

    }

    private synchronized void providerWaitingTimeUpdateWhenTrip(String tripId, long startWaitingTime, long endWaitingTime) {
        final JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.put(Const.Params.PROVIDER_ID, preferenceHelper.getProviderId());
            jsonObject.put(Const.Params.TOKEN, preferenceHelper.getSessionToken());
            jsonObject.put(Const.Params.TRIP_ID, tripId);
            Log.d("waiting_time ", networkHandler.isNetworkAvailable() + " " + socketHelper.isConnected());
            if (networkHandler.isNetworkAvailable() && socketHelper.isConnected()) {
                DatabaseClient.getInstance(this).insertWaitingTime(startWaitingTime, endWaitingTime, () -> {
                    Log.d("waiting_time ", "inserted all waiting times to local DB");
                    DatabaseClient.getInstance(EberUpdateService.this).getAllWaitingTime(waitingTimes -> {
                        try {
                            Log.d("waiting_time ", "get waiting times to local DB");
                            jsonObject.put(Const.Params.STOPS, waitingTimes);
                            updateWaitingTimeUsingSocket(jsonObject);
                        } catch (JSONException e) {
                            AppLog.handleException(TAG, e);
                        }
                    });
                });
            } else {
                if (!TextUtils.isEmpty(tripId)) {
                    DatabaseClient.getInstance(this).insertWaitingTime(startWaitingTime, endWaitingTime, () -> {

                    });
                }
            }
        } catch (JSONException e) {
            AppLog.handleException(TAG, e);
        }
    }

    private int getNotificationIcon() {
        boolean useWhiteIcon = (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP);
        return useWhiteIcon ? R.drawable.ic_stat_tasleem : R.mipmap.ic_launcher;
    }

    private void clearNotification() {
        NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.cancel(Const.SERVICE_NOTIFICATION_ID);
    }

    private void getProviderLocationResponse(ProviderLocationResponse response) {
        if (response.isSuccess()) {
            if (preferenceHelper.getIsHaveTrip()) {
                DatabaseClient.getInstance(this).deleteLocation(String.valueOf(response.getLocationUniqueId()), new DataModificationListener() {
                    @Override
                    public void onSuccess() {
                        int uniqueIdForLocation = preferenceHelper.getLocationUniqueId();
                        uniqueIdForLocation++;
                        preferenceHelper.putLocationUniqueId(uniqueIdForLocation);
                    }
                });
            }
            CurrentTrip currentTrip = CurrentTrip.getInstance();
            currentTrip.setTotalDistance(response.getTotalDistance());
            currentTrip.setTotalTime(response.getTotalTime());
            Utils.hideLocationUpdateDialog();
        }
    }

    /**
     * this method get Notification object which help to notify user as foreground service
     *
     * @param notificationDetails
     * @return
     */
    private Notification getNotification(String notificationDetails) {
        NotificationManager mNotificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel mChannel = new NotificationChannel(CHANNEL_ID, "Location Service", NotificationManager.IMPORTANCE_DEFAULT);
            if (mNotificationManager != null) {
                mNotificationManager.createNotificationChannel(mChannel);
            }
        }
        Intent intent = new Intent(getApplicationContext(), MainDrawerActivity.class);
        PendingIntent notifyIntent = PendingIntent.getActivity(EberUpdateService.this, 0, intent, Build.VERSION.SDK_INT >= Build.VERSION_CODES.S ? PendingIntent.FLAG_MUTABLE : PendingIntent.FLAG_UPDATE_CURRENT);
        Notification.Builder builder = new Notification.Builder(this).setOngoing(true);
        builder.setSmallIcon(getNotificationIcon()).setColor(ResourcesCompat.getColor(getResources(), R.color.color_app_theme_dark, null)).setContentTitle(notificationDetails).setContentText(getResources().getString(R.string.msg_service)).setContentIntent(notifyIntent).setAutoCancel(false);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            builder.setChannelId(CHANNEL_ID); // Channel ID
        }
        return builder.build();
    }

    private void setLastLocation(Location location) {
        if (lastLocation == null) {
            lastLocation = new Location("lastLocation");
        }
        lastLocation.set(location);
    }

    private boolean locationMatch(Location lastLocation, Location currentLocation) {
        if (lastLocation != null && currentLocation != null) {
            return lastLocation.getLongitude() == currentLocation.getLongitude() && lastLocation.getLatitude() == currentLocation.getLatitude();
        } else {
            return false;
        }
    }

    /**
     * emit provider location using socket
     *
     * @param jsonObject
     */
    private void updateLocationUsingSocket(JSONObject jsonObject) {
        Log.d("Location_driver ", "updateLocationUsingSocket");
        if (socketHelper != null && socketHelper.isConnected()) {
            Log.d("Location_driver ", "updateLocationUsingSocket " + (socketHelper != null && socketHelper.isConnected()));
            isWaitForLocationUpdate = true;
            try {
                socketHelper.getSocket().emit(SocketHelper.UPDATE_LOCATION, jsonObject, new Ack() {
                    @Override
                    public void call(Object... args) {
                        Log.d("Location_driver ", "emit response");
                        if (args != null) {
                            JSONObject jsonObject1 = (JSONObject) args[0];
                            Log.d("Location_driver ", "json object : " + jsonObject1.toString());
                            ProviderLocationResponse providerLocationResponse = ApiClient.getGsonInstance().fromJson(jsonObject1.toString(), ProviderLocationResponse.class);
                            getProviderLocationResponse(providerLocationResponse);
                        }
                        isWaitForLocationUpdate = false;
                    }
                });
            } catch (Exception e) {
                isWaitForLocationUpdate = false;
                e.printStackTrace();
            }
        }
    }

    /**
     * emit provider waiting time using socket
     *
     * @param jsonObject
     */
    private synchronized void updateWaitingTimeUsingSocket(JSONObject jsonObject) {
        Log.d("waiting_time ", "updateWaitingTimeUsingSocket");
        if (socketHelper != null && socketHelper.isConnected()) {
            Log.d("waiting_time ", "updateWaitingTimeUsingSocket " + (socketHelper != null && socketHelper.isConnected()));
            try {
                socketHelper.getSocket().emit(SocketHelper.UPDATE_TRIP_STOPS, jsonObject, new Ack() {
                    @Override
                    public void call(Object... args) {
                        Log.d("waiting_time ", "emit response");
                        if (args != null) {
                            JSONObject jsonObject1 = (JSONObject) args[0];
                            Log.d("waiting_time ", "jsonObject : " + jsonObject1.toString());
                            WaitingTimeResponse waitingTimeResponse = ApiClient.getGsonInstance().fromJson(jsonObject1.toString(), WaitingTimeResponse.class);
                            if (waitingTimeResponse.isSuccess())
                                DatabaseClient.getInstance(EberUpdateService.this).clearWaitingTimes(() -> {

                                });
                        }
                    }
                });
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void updateLocation() {
        if (preferenceHelper.getSessionToken() != null) {
            if (currentLocation != null) {
                if (preferenceHelper.getIsHaveTrip()) {
                    providerLocationUpdateWhenTrip(preferenceHelper.getTripId());
                } else {
                    if (preferenceHelper.getIsProviderOnline() == Const.ProviderStatus.PROVIDER_STATUS_ONLINE) {
                        providerLocationUpdateNoTrip();
                    }
                }
            }
        }
    }


    private void initNetworkManager() {
        networkHandler = new NetworkHandler(EberUpdateService.this);
        if (networkHandler.isNetworkAvailable()) {
            if (socketHelper != null) {
                socketHelper.socketConnect();
            }
        }
    }

    private class ServiceReceiver extends BroadcastReceiver {


        @Override
        public void onReceive(Context context, Intent intent) {
            if (intent.getAction() != null) {
                switch (intent.getAction()) {
                    case Const.ACTION_CANCEL_NOTIFICATION:
                        clearNotification();
                        break;
                }
            }
        }
    }

}
