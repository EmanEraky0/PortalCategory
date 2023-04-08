package com.example.portalcategory.data.repo

import com.example.portalcategory.domain.models.mainCategory.CategoriesData
import com.example.portalcategory.domain.models.mainCategory.Statistics
import com.example.portalcategory.domain.models.subCategory.PropertiesData
import com.example.portalcategory.utils.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class FakeMainRepoImpl : MainRepository {

    private val categoryResponse = CategoriesData(arrayListOf(), Statistics())
    private val propertiesResponse = ArrayList<PropertiesData>()
    private val optionsResponse = ArrayList<PropertiesData>()

    override suspend fun getAllCats(): Flow<Resource<CategoriesData>> {
        return flow {
            emit(Resource.Success (categoryResponse))
        }
    }

    override suspend fun getSubCatId(catId: Int): Flow<Resource<ArrayList<PropertiesData>>> {
        return flow {
            emit(Resource.Success (propertiesResponse))
        }
    }

    override suspend fun getOptionsById(subId: Int): Flow<Resource<ArrayList<PropertiesData>>> {
        return flow {
            emit(Resource.Success (optionsResponse))
        }
    }

    override suspend fun getAll(): Int {
        return 0
    }

}