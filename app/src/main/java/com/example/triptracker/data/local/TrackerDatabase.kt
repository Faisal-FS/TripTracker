package com.example.triptracker.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters

@Database(entities = [Run::class], version = 1, exportSchema = false)
@TypeConverters(Converters::class)
abstract class TrackerDatabase: RoomDatabase() {
    abstract fun getRunDao() : RunDao
}