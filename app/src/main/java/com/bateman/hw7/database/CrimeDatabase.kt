package com.bateman.hw7.database

import androidx.room.RoomDatabase
import androidx.room.TypeConverter
import androidx.room.TypeConverters
import com.bateman.hw7.Crime
import androidx.room.Database as Database1


@Database1(entities = [Crime:: class], version=1, exportSchema = false)
@TypeConverters(CrimeTypeConverters::class)
abstract class CrimeDatabase: RoomDatabase() {
    abstract fun crimeDAO(): CrimeDao


}