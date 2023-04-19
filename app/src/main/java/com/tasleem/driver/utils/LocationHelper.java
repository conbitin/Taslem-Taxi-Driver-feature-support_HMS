package com.tasleem.driver.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.IntentSender;
import android.location.Location;
import android.os.Looper;

import androidx.appcompat.app.AppCompatActivity;

import org.xms.g.common.api.ApiException;
import org.xms.g.common.api.CommonStatusCodes;
import org.xms.g.common.api.ResolvableApiException;
import org.xms.g.location.FusedLocationProviderClient;
import org.xms.g.location.LocationAvailability;
import org.xms.g.location.LocationCallback;
import org.xms.g.location.LocationRequest;
import org.xms.g.location.LocationResult;
import org.xms.g.location.LocationServices;
import org.xms.g.location.LocationSettingsRequest;
import org.xms.g.location.LocationSettingsResponse;
import org.xms.g.location.LocationSettingsStatusCodes;
import org.xms.g.location.SettingsClient;
import org.xms.g.tasks.OnSuccessListener;
import org.xms.g.tasks.Task;

/**
 * Created by elluminati on 20-06-2016.
 */
public class LocationHelper {

    private static final long INTERVAL = 5000;// millisecond
    private static final long FASTEST_INTERVAL = 4000;// millisecond
    private static final int RESOLUTION_REQUIRED = 6;
    private static final int SETTINGS_CHANGE_UNAVAILABLE = 8502;
    private final Context context;
    private final FusedLocationProviderClient fusedLocationProviderClient;
    public LocationRequest locationRequest;
    private OnLocationReceived locationReceived;
    private LocationSettingsRequest locationSettingsRequest;
    private SettingsClient client;
    private LocationCallback locationCallback;

    public LocationHelper(Context context) {
        this.context = context;
        fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(context);
        getLocationRequest();
        setLocationCallback();
    }

    private void setLocationCallback() {
        locationCallback = new LocationCallback() {
            @Override
            public void onLocationResult(LocationResult locationResult) {
                super.onLocationResult(locationResult);
                Location currentLocation = locationResult.getLastLocation();
                if (currentLocation != null) {
                    locationReceived.onLocationChanged(currentLocation);
                }
            }

            @Override
            public void onLocationAvailability(LocationAvailability locationAvailability) {
                super.onLocationAvailability(locationAvailability);
            }
        };
    }

    public void setLocationReceivedLister(OnLocationReceived locationReceived) {
        this.locationReceived = locationReceived;
    }

    private void getLocationRequest() {
        locationRequest = LocationRequest.create();
        locationRequest.setInterval(INTERVAL);
        locationRequest.setFastestInterval(FASTEST_INTERVAL);
        locationRequest.setPriority(LocationRequest.getPRIORITY_HIGH_ACCURACY());
        LocationSettingsRequest.Builder builder = new LocationSettingsRequest.Builder().addLocationRequest(locationRequest);
        locationSettingsRequest = builder.build();
        client = LocationServices.getSettingsClient(context);
    }

    public void stopLocationUpdate() {
        fusedLocationProviderClient.removeLocationUpdates(locationCallback);
    }

    @SuppressLint("MissingPermission")
    public void startLocationUpdate() {
        fusedLocationProviderClient.requestLocationUpdates(locationRequest, locationCallback, Looper.myLooper());
    }


    @SuppressLint("MissingPermission")
    public void getLastLocation(OnSuccessListener<Location> onSuccessListener) {
        fusedLocationProviderClient.getLastLocation().addOnSuccessListener(onSuccessListener);
    }

    public void onStart() {
        startLocationUpdate();
    }

    public void onStop() {
        stopLocationUpdate();
    }

    public void setLocationSettingRequest(final AppCompatActivity activity, final int requestCode, OnSuccessListener<LocationSettingsResponse> onSuccessListener, final NoGPSDeviceFoundListener noGPSDeviceFoundListener) {
        Task<LocationSettingsResponse> task = client.checkLocationSettings(locationSettingsRequest);
        task.addOnFailureListener(activity, e -> {
            int statusCode = (ApiException.dynamicCast(e)).getStatusCode();
            switch (statusCode) {
                case RESOLUTION_REQUIRED:
                    try {
                        ResolvableApiException resolvable = ResolvableApiException.dynamicCast(e);
                        resolvable.startResolutionForResult(activity, requestCode);
                    } catch (IntentSender.SendIntentException sendEx) {
                    }
                    break;
                case SETTINGS_CHANGE_UNAVAILABLE:
                    if (noGPSDeviceFoundListener != null) {
                        noGPSDeviceFoundListener.noFound();
                    }
                    break;
            }
        });
        task.addOnSuccessListener(activity, onSuccessListener);
    }

    public interface OnLocationReceived {

        void onLocationChanged(Location location);

    }

    public interface NoGPSDeviceFoundListener {
        void noFound();
    }
}
