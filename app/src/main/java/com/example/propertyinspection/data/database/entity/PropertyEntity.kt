package com.example.propertyinspection.data.database.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "properties")
data class PropertyEntity(
    @field:PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val address: String,
    val ownerName: String,
    val lat: Double?,
    val long: Double?,
    val type: String?,
    val totalRooms: Int,
    val notes: String?,
    @ColumnInfo(name = "is_occupied")
    val isOccupied: Boolean,
)
