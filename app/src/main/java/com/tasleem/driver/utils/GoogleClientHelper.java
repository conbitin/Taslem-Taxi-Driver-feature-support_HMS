package com.tasleem.driver.utils;

import android.content.Context;

import androidx.fragment.app.FragmentActivity;

import org.xms.g.auth.api.Auth;
import org.xms.g.auth.api.signin.ExtensionSignInOptions;
import org.xms.g.common.api.ExtensionApiClient;
import org.xms.g.location.LocationServices;

public class GoogleClientHelper {
    private final ExtensionApiClient.Builder builder;
    private ExtensionApiClient googleApiClient;

    public GoogleClientHelper(Context context) {
        ExtensionSignInOptions googleSignInOptions = new ExtensionSignInOptions.Builder(
                ExtensionSignInOptions.getDEFAULT_SIGN_IN())
                .requestEmail().build();
        builder = new ExtensionApiClient.Builder(context)
                .addApi(Auth.getGOOGLE_SIGN_IN_API(), googleSignInOptions)
                .addApi(LocationServices.getAPI());
    }

    public GoogleClientHelper(FragmentActivity fragmentActivity, ExtensionApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        ExtensionSignInOptions googleSignInOptions = new ExtensionSignInOptions.Builder(
                ExtensionSignInOptions.getDEFAULT_SIGN_IN())
                .requestEmail().build();
        builder = new ExtensionApiClient.Builder(fragmentActivity).enableAutoManage(
                        fragmentActivity, onConnectionFailedListener)
                .addApi(Auth.getGOOGLE_SIGN_IN_API(), googleSignInOptions)
                .addApi(LocationServices.getAPI());
    }

    public ExtensionApiClient build() {
        googleApiClient = builder.build();
        return googleApiClient;
    }

    public void connect() {
        if (googleApiClient != null && !googleApiClient.isConnected()) {
            googleApiClient.connect(ExtensionApiClient.getSIGN_IN_MODE_OPTIONAL());
        }
    }

    public void disconnect() {
        if (googleApiClient != null) {
            googleApiClient.disconnect();
        }
    }
}
