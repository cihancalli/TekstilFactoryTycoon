package com.zerdasoftware.tekstilfactorytycoon.data.source.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.zerdasoftware.tekstilfactorytycoon.domain.entity.MainEntity

@Dao
interface MainDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertMain(mainEntity: MainEntity)

    @Query("SELECT * FROM mainEntity")
    suspend fun getMain() : MainEntity
}