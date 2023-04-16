package com.tasleem.driver.models.datamodels;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class TripDetailOnSocket {
    @SerializedName("is_trip_updated")
    private boolean isTripUpdated;
    @SerializedName("location")
    private List<Double> providerLocations;
    @SerializedName("total_time")
    private Double totalTime;
    @SerializedName("total_distance")
    private Double totalDistance;
    @SerializedName("bearing")
    private Double bearing;
    // this for estimated
    @SerializedName("estimation_trip_time_distance")
    private boolean estimationTripTimeDistance;
    @SerializedName("trip_id")
    private String tripId;
    @SerializedName("distance")
    private Double distance; // distance in km (provider to user estimated distance)
    @SerializedName("time")
    private Double time; // time in min (provider to user estimated time)

    public List<Double> getProviderLocations() {
        return providerLocations;
    }

    public void setProviderLocations(List<Double> providerLocations) {
        this.providerLocations = providerLocations;
    }

    public Double getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(Double totalTime) {
        this.totalTime = totalTime;
    }

    public boolean isTripUpdated() {
        return isTripUpdated;
    }

    public void setTripUpdated(boolean tripUpdated) {
        isTripUpdated = tripUpdated;
    }

    public Double getTotalDistance() {
        return totalDistance;
    }

    public void setTotalDistance(Double totalDistance) {
        this.totalDistance = totalDistance;
    }

    public Double getBearing() {
        return bearing;
    }

    public void setBearing(Double bearing) {
        this.bearing = bearing;
    }

    public boolean isEstimationTripTimeDistance() {
        return estimationTripTimeDistance;
    }

    public String getTripId() {
        return tripId;
    }

    public Double getDistance() {
        return distance;
    }

    public Double getTime() {
        return time;
    }
}
