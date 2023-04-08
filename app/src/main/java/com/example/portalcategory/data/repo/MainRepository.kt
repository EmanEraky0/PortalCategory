package com.example.portalcategory.data.repo

import com.example.portalcategory.domain.models.mainCategory.CategoriesData
import com.example.portalcategory.domain.models.subCategory.PropertiesData
import com.example.portalcategory.utils.Resource
import kotlinx.coroutines.flow.Flow

interface MainRepository {

    suspend fun getAllCats(): Flow<Resource<CategoriesData>>

    suspend fun getSubCatId(catId: Int): Flow<Resource<ArrayList<PropertiesData>>>

    suspend fun getOptionsById(subId: Int): Flow<Resource<ArrayList<PropertiesData>>>


    suspend fun getAll(): Int

}