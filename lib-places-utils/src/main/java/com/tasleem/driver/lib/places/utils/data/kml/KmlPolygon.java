/*
 * Copyright 2020 Supasin Tatiyanupanwong
 * Copyright 2020 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tasleem.driver.lib.places.utils.data.kml;

import com.huawei.hms.maps.model.LatLng;
import com.tasleem.driver.lib.places.utils.data.DataPolygon;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a KML Polygon. Contains a single array of outer boundary coordinates and an array of
 * arrays for the inner boundary coordinates.
 */
public class KmlPolygon implements DataPolygon<ArrayList<ArrayList<LatLng>>> {

    public static final String GEOMETRY_TYPE = "Polygon";

    private final List<LatLng> mOuterBoundaryCoordinates;

    private final List<List<LatLng>> mInnerBoundaryCoordinates;

    /**
     * Creates a new KmlPolygon object
     *
     * @param outerBoundaryCoordinates single array of outer boundary coordinates
     * @param innerBoundaryCoordinates multiple arrays of inner boundary coordinates
     */
    public KmlPolygon(List<LatLng> outerBoundaryCoordinates,
                      List<List<LatLng>> innerBoundaryCoordinates) {
        if (outerBoundaryCoordinates == null) {
            throw new IllegalArgumentException("Outer boundary coordinates cannot be null");
        } else {
            mOuterBoundaryCoordinates = outerBoundaryCoordinates;
            mInnerBoundaryCoordinates = innerBoundaryCoordinates;
        }
    }

    /**
     * Gets the type of geometry
     *
     * @return type of geometry
     */
    public String getGeometryType() {
        return GEOMETRY_TYPE;
    }

    /**
     * Gets the coordinates of the Polygon
     *
     * @return ArrayList of an ArrayList of LatLng points
     */
    public List<List<LatLng>> getGeometryObject() {
        List<List<LatLng>> coordinates = new ArrayList<>();
        coordinates.add(mOuterBoundaryCoordinates);
        //Polygon objects do not have to have inner holes
        if (mInnerBoundaryCoordinates != null) {
            coordinates.addAll(mInnerBoundaryCoordinates);
        }
        return coordinates;
    }

    /**
     * Gets an array of outer boundary coordinates
     *
     * @return array of outer boundary coordinates
     */
    public List<LatLng> getOuterBoundaryCoordinates() {
        return mOuterBoundaryCoordinates;
    }

    /**
     * Gets an array of arrays of inner boundary coordinates
     *
     * @return array of arrays of inner boundary coordinates
     */
    public List<List<LatLng>> getInnerBoundaryCoordinates() {
        return mInnerBoundaryCoordinates;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(GEOMETRY_TYPE).append("{");
        sb.append("\n outer coordinates=").append(mOuterBoundaryCoordinates);
        sb.append(",\n inner coordinates=").append(mInnerBoundaryCoordinates);
        sb.append("\n}\n");
        return sb.toString();
    }
}
