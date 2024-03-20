package com.example.triptracker.data

import androidx.lifecycle.LiveData
import com.example.triptracker.data.local.Run
import com.example.triptracker.data.local.RunDao

class MainRepository(
    private val runDao: RunDao
) {

    suspend fun insertRun(run: Run) {
        runDao.insertRun(run)
    }

    suspend fun deleteRun(run: Run) {
        runDao.deleteRun(run)
    }

    fun getAllRunsSortedByDate(): LiveData<List<Run>> {
        return runDao.getAllRunsSortedByDate()
    }

}