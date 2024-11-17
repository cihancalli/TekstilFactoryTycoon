package com.zerdasoftware.tekstilfactorytycoon.domain.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "mainEntity")
data class MainEntity (
    @ColumnInfo("mainName")
    val mainName: String? = null,
){
    @PrimaryKey(autoGenerate = false)
    var uuid : Int = 1
}



