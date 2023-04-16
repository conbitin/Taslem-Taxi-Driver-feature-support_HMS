package com.tasleem.driver.roomdata;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;


@Entity
public class WaitingTime implements Serializable {

    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "start_time")
    private long startTime;

    @ColumnInfo(name = "end_time")
    private long endTime;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }
}
