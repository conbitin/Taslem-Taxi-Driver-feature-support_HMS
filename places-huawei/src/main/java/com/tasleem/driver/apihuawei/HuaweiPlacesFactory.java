/*
 * Copyright 2020 Supasin Tatiyanupanwong
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.tasleem.driver.apihuawei;

import android.content.Context;
import android.content.SharedPreferences;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

import com.huawei.agconnect.config.AGConnectServicesConfig;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.api.HuaweiApiAvailability;

import java.util.Arrays;
import java.util.List;

import com.tasleem.driver.common.places.PlacesFactory;
import com.tasleem.driver.apihuawei.net.HuaweiPlacesClient;
import com.tasleem.driver.common.places.net.PlacesClient;

import static androidx.annotation.RestrictTo.Scope.LIBRARY;

@RestrictTo(LIBRARY)
@SuppressWarnings("unused")
public final class HuaweiPlacesFactory implements PlacesFactory {

    private static final String PREF_NAME = "TaxiAnyTimeAnyWhereProvider";
    private final String GOOGLE_SERVER_KEY = "google_server_key";
    private String mApiKey;

    private HuaweiPlacesFactory(String apiKey) {
        mApiKey = apiKey;
    }

    @Override
    public @NonNull PlacesClient createClient(@NonNull Context context) {
        if (mApiKey == null) {
            SharedPreferences app_preferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
            mApiKey = app_preferences.getString(GOOGLE_SERVER_KEY, "");
        }

        return new HuaweiPlacesClient(context, mApiKey);
    }


    public static @Nullable PlacesFactory buildIfSupported(@NonNull Context context) {
        final List<Integer> unavailableResults = Arrays.asList(
                ConnectionResult.SERVICE_DISABLED,
                ConnectionResult.SERVICE_MISSING,
                ConnectionResult.SERVICE_INVALID);
        final int result =
                HuaweiApiAvailability.getInstance().isHuaweiMobileServicesAvailable(context);
        if (unavailableResults.contains(result)) {
            return null;
        }

        String apiKey;
        try {
            apiKey = AGConnectServicesConfig.fromContext(context).getString("client/api_key");
        } catch (Exception ex) {
            apiKey = null;
        }
//        if (TextUtils.isEmpty(apiKey)) {
//            throw new NullPointerException("API key is not found in agconnect-services.json");
//        }

        return new HuaweiPlacesFactory(apiKey);
    }

}
