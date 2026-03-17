package com.example.propertyinspection.data.database.dao

import androidx.paging.PagingSource
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.propertyinspection.data.database.entity.PropertyEntity

@Dao
interface PropertyDao {
    fun getPagedProperties(): PagingSource<Int, PropertyEntity>

    @Insert
    fun insertProperty(property: PropertyEntity)

    @Query("SELECT * FROM properties")
    fun getAllProperties(): List<PropertyEntity>

    @Query("SELECT * FROM properties WHERE id = :id")
    fun findById(id: Int): PropertyEntity

    @Delete
    fun delete(property: PropertyEntity)
}