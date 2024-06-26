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

package com.tasleem.driver.apigoogle.net;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

import com.tasleem.driver.apigoogle.model.GooglePlace;
import com.tasleem.driver.common.places.net.FetchPlaceRequest;

import static androidx.annotation.RestrictTo.Scope.LIBRARY;

@RestrictTo(LIBRARY)
public final class GoogleFetchPlaceRequest {

    private GoogleFetchPlaceRequest() {}


    public static @NonNull com.google.android.libraries.places.api.net.FetchPlaceRequest unwrap(
            @NonNull FetchPlaceRequest wrapped) {
        return com.google.android.libraries.places.api.net.FetchPlaceRequest
                .newInstance(
                        wrapped.getPlaceId(),
                        GooglePlace.Field.unwrap(wrapped.getPlaceFields()));
    }

}
