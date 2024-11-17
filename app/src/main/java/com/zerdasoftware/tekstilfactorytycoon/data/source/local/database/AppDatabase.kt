package com.zerdasoftware.tekstilfactorytycoon.data.source.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.zerdasoftware.tekstilfactorytycoon.data.source.local.dao.MainDao
import com.zerdasoftware.tekstilfactorytycoon.domain.entity.MainEntity

@Database(
    entities = [MainEntity::class],
    version = 1,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {

    abstract fun mainDao() : MainDao

}