package com.tasleem.driver.models.responsemodels;

import com.google.gson.annotations.SerializedName;

public class EstimatedTimeAndDistanceResponse {
    @SerializedName("success")
    private boolean success;
    @SerializedName("distance")
    private double distance = -1;
    @SerializedName("time")
    private double time = -1;

    public boolean isSuccess() {
        return success;
    }

    public double getDistance() {
        return distance;
    }

    public double getTime() {
        return time;
    }
}
