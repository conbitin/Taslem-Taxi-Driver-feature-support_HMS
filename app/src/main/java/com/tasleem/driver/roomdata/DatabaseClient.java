package com.tasleem.driver.roomdata;

import android.content.Context;
import android.os.AsyncTask;

import androidx.annotation.NonNull;
import androidx.room.Room;

import com.tasleem.driver.utils.AppLog;
import com.tasleem.driver.utils.Const;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * Created by Ravi Bhalodi on 24,February,2020 in Elluminati
 */
public class DatabaseClient {
    private static DatabaseClient databaseClient;
    private final Context context;
    //our app database object
    private final AppDatabase appDatabase;


    private DatabaseClient(Context context) {
        this.context = context;

        //creating the app database with Room database builder
        //DhaweeyeDriverLocation is the name of the database
        appDatabase = Room.databaseBuilder(context, AppDatabase.class, "DhaweeyeDriverLocation")
                .fallbackToDestructiveMigration()
                .build();
    }

    /**
     * Gets instance.
     *
     * @param context the context
     * @return the instance
     */
    public static synchronized DatabaseClient getInstance(Context context) {
        if (databaseClient == null) {
            databaseClient = new DatabaseClient(context);
        }
        return databaseClient;
    }


    /**
     * Insert location.
     *
     * @param latitude                 the latitude
     * @param longitude                the longitude
     * @param uniqueId                 the unique id
     * @param dataModificationListener the data modification listener
     */
    public void insertLocation(final double latitude, final double longitude, final int uniqueId, @NonNull final DataModificationListener dataModificationListener) {

        new AsyncTask<Void, Void, Void>() {

            @Override
            protected Void doInBackground(Void... voids) {
                Location location = new Location();
                location.setLatitude(String.valueOf(latitude));
                location.setLongitude(String.valueOf(longitude));
                location.setLocationUniqueId(String.valueOf(uniqueId));
                location.setTime(String.valueOf(System.currentTimeMillis()));
                appDatabase.locationDao().insert(location);
                return null;
            }

            @Override
            protected void onPostExecute(Void aBoolean) {
                super.onPostExecute(aBoolean);
                dataModificationListener.onSuccess();
            }
        }.execute();
    }

    /**
     * Clear location.
     *
     * @param dataModificationListener the data modification listener
     */
    public void clearLocation(@NonNull final DataModificationListener dataModificationListener) {
        new AsyncTask<Void, Void, Void>() {

            @Override
            protected Void doInBackground(Void... voids) {
                appDatabase.locationDao().deleteAll();
                return null;
            }

            @Override
            protected void onPostExecute(Void aBoolean) {
                super.onPostExecute(aBoolean);
                dataModificationListener.onSuccess();
            }
        }.execute();
    }

    /**
     * Gets all location.
     *
     * @param dataLocationsListener the data locations listener
     */
    public void getAllLocation(@NonNull final DataLocationsListener dataLocationsListener) {

        new AsyncTask<Void, Void, List<Location>>() {

            @Override
            protected List<Location> doInBackground(Void... voids) {
                return appDatabase.locationDao().getAll();
            }

            @Override
            protected void onPostExecute(List<Location> locations) {
                super.onPostExecute(locations);
                JSONArray locationJSONArray = new JSONArray();
                if (locations != null) {
                    Iterator<Location> locationIterator = locations.iterator();
                    do {
                        try {
                            Location location = locationIterator.next();
                            JSONArray locationArray = new JSONArray();
                            locationArray.put(location.getLatitude());
                            locationArray.put(location.getLongitude());
                            locationArray.put(location.getTime());
                            locationJSONArray.put(locationArray);
                        } catch (NoSuchElementException e) {
                            AppLog.handleException("DatabaseClient", e);
                        }
                    } while (locationIterator.hasNext());
                    dataLocationsListener.onSuccess(locationJSONArray);
                } else {
                    dataLocationsListener.onSuccess(locationJSONArray);
                }


            }
        }.execute();
    }

    /**
     * Gets count.
     *
     * @param dataCountListener the data count listener
     */
    public void getCount(@NonNull final DataCountListener dataCountListener) {

        new AsyncTask<Void, Void, Long>() {

            @Override
            protected Long doInBackground(Void... voids) {
                return appDatabase.locationDao().count();
            }

            @Override
            protected void onPostExecute(Long count) {
                super.onPostExecute(count);
                dataCountListener.onSuccess(count);
            }
        }.execute();
    }


    /**
     * Delete location.
     *
     * @param uniqueId                 the unique id
     * @param dataModificationListener the data modification listener
     */
    public void deleteLocation(final String uniqueId, @NonNull final DataModificationListener dataModificationListener) {

        new AsyncTask<Void, Void, Void>() {

            @Override
            protected Void doInBackground(Void... voids) {
                try {
                    appDatabase.locationDao().deleteLocation(uniqueId);
                } catch (NoSuchElementException e) {

                }

                return null;
            }

            @Override
            protected void onPostExecute(Void count) {
                super.onPostExecute(count);
                dataModificationListener.onSuccess();
            }
        }.execute();
    }

    /**
     * Insert waiting time.
     *
     * @param startTime                start time when the driver is stop
     * @param endTime                  end time when the driver is stop
     * @param dataModificationListener the data modification listener
     */
    public void insertWaitingTime(final long startTime, final long endTime, @NonNull final DataModificationListener dataModificationListener) {

        new AsyncTask<Void, Void, Void>() {

            @Override
            protected Void doInBackground(Void... voids) {
                WaitingTime waitingTime = new WaitingTime();
                waitingTime.setStartTime(startTime);
                waitingTime.setEndTime(endTime);
                appDatabase.waitingTimeDao().insert(waitingTime);
                return null;
            }

            @Override
            protected void onPostExecute(Void aBoolean) {
                super.onPostExecute(aBoolean);
                dataModificationListener.onSuccess();
            }
        }.execute();
    }

    /**
     * Clear waiting time.
     *
     * @param dataModificationListener the data modification listener
     */
    public void clearWaitingTime(@NonNull final DataModificationListener dataModificationListener) {
        new AsyncTask<Void, Void, Void>() {

            @Override
            protected Void doInBackground(Void... voids) {
                appDatabase.waitingTimeDao().deleteAll();
                return null;
            }

            @Override
            protected void onPostExecute(Void aBoolean) {
                super.onPostExecute(aBoolean);
                dataModificationListener.onSuccess();
            }
        }.execute();
    }

    /**
     * Gets all waiting time.
     *
     * @param dataLocationsListener the data waiting time listener
     */
    public void getAllWaitingTime(@NonNull final DataLocationsListener dataLocationsListener) {

        new AsyncTask<Void, Void, List<WaitingTime>>() {

            @Override
            protected List<WaitingTime> doInBackground(Void... voids) {
                return appDatabase.waitingTimeDao().getAll();
            }

            @Override
            protected void onPostExecute(List<WaitingTime> waitingTimes) {
                super.onPostExecute(waitingTimes);
                JSONArray waitingTimesJSONArray = new JSONArray();
                if (waitingTimes != null) {
                    Iterator<WaitingTime> waitingTimeIterator = waitingTimes.iterator();
                    do {
                        try {
                            WaitingTime waitingTime = waitingTimeIterator.next();
                            JSONObject waitingTimeObject = new JSONObject();
                            waitingTimeObject.put(Const.Params.START, waitingTime.getStartTime());
                            waitingTimeObject.put(Const.Params.END, waitingTime.getEndTime());
                            waitingTimesJSONArray.put(waitingTimeObject);
                        } catch (NoSuchElementException e) {
                            AppLog.handleException("DatabaseClient", e);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    } while (waitingTimeIterator.hasNext());
                    dataLocationsListener.onSuccess(waitingTimesJSONArray);
                } else {
                    dataLocationsListener.onSuccess(waitingTimesJSONArray);
                }
            }
        }.execute();
    }

    /**
     * Clear waiting times.
     *
     * @param dataModificationListener the data modification listener
     */
    public void clearWaitingTimes(@NonNull final DataModificationListener dataModificationListener) {
        new AsyncTask<Void, Void, Void>() {

            @Override
            protected Void doInBackground(Void... voids) {
                appDatabase.waitingTimeDao().deleteAll();
                return null;
            }

            @Override
            protected void onPostExecute(Void aBoolean) {
                super.onPostExecute(aBoolean);
                dataModificationListener.onSuccess();
            }
        }.execute();
    }

    /**
     * Gets count.
     *
     * @param dataCountListener the data count listener
     */
    public void getWaitingTimesCount(@NonNull final DataCountListener dataCountListener) {
        new AsyncTask<Void, Void, Long>() {

            @Override
            protected Long doInBackground(Void... voids) {
                return appDatabase.waitingTimeDao().count();
            }

            @Override
            protected void onPostExecute(Long count) {
                super.onPostExecute(count);
                dataCountListener.onSuccess(count);
            }
        }.execute();
    }


}
