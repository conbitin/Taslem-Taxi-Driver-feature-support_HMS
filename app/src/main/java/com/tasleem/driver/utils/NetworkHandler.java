package com.tasleem.driver.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;

public class NetworkHandler {
    private final Context context;
    public NetworkHandler(Context context) {
        this.context = context;
    }

    public boolean isNetworkAvailable() {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            Network network = connectivityManager.getActiveNetwork();
            NetworkCapabilities activeNetwork = connectivityManager.getNetworkCapabilities(network);
            return network != null && activeNetwork != null && (activeNetwork.hasTransport(NetworkCapabilities.TRANSPORT_WIFI) || activeNetwork.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR) || activeNetwork.hasTransport(NetworkCapabilities.TRANSPORT_ETHERNET) || activeNetwork.hasTransport(NetworkCapabilities.TRANSPORT_BLUETOOTH));
        } else {
            NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
            return (networkInfo != null && networkInfo.isConnected());
        }
    }
}