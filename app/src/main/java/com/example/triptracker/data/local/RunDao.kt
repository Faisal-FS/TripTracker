package com.example.triptracker.data.local

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface RunDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertRun(run: Run)


    @Delete
    suspend fun deleteRun(run: Run)

    @Query("SELECT * FROM tbl_run ORDER BY timestamp DESC")
    fun getAllRunsSortedByDate(): LiveData<List<Run>>

}