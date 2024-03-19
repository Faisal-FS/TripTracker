package com.example.triptracker.di

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.triptracker.data.local.TrackerDatabase
import com.example.triptracker.others.Constants.DATABASE_NAME
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideDb(@ApplicationContext context: Context) =
        Room.databaseBuilder(context, TrackerDatabase::class.java, DATABASE_NAME).build()

    @Singleton
    @Provides
    fun provideRunDao(db: TrackerDatabase) = db.getRunDao()
}