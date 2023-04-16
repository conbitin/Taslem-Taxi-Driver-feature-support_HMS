package com.tasleem.driver.roomdata;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;


@Dao
public interface WaitingTimeDao {

    @Query("SELECT * FROM waitingtime")
    List<WaitingTime> getAll();

    @Insert
    void insert(WaitingTime waitingTime);

    @Delete
    void delete(WaitingTime waitingTime);

    @Update
    void update(WaitingTime waitingTime);

    @Query("DELETE FROM waitingtime")
    void deleteAll();

    @Query("SELECT COUNT(*) FROM waitingtime")
    long count();

}
