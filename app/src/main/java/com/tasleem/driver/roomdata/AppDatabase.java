package com.tasleem.driver.roomdata;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Location.class, WaitingTime.class}, version = 2, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {

    public abstract LocationDao locationDao();

    public abstract WaitingTimeDao waitingTimeDao();

}
