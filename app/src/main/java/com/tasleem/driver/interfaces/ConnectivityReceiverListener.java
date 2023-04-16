package com.tasleem.driver.interfaces;

public interface ConnectivityReceiverListener {
    void onNetworkConnectionChanged(boolean isConnected);

    void onGpsConnectionChanged(boolean isConnected);
}

