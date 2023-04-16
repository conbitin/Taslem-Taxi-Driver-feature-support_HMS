package com.tasleem.driver.models.responsemodels;

import com.google.gson.annotations.SerializedName;

public class WaitingTimeResponse {
    @SerializedName("success")
    private boolean success;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
