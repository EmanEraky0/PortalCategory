package com.example.portalcategory.data.repo

import com.example.portalcategory.data.api.ApiService
import com.example.portalcategory.domain.models.mainCategory.CategoriesData
import com.example.portalcategory.domain.models.subCategory.PropertiesData
import com.example.portalcategory.utils.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class MainRepoImpl @Inject constructor(private val apiService: ApiService) : MainRepository {
    override suspend fun getAllCats(): Flow<Resource<CategoriesData>> {
        return flow {
            emit(Resource.Loading)
            val resource = try {
                val result = apiService.getAllCats()
                if (result.code == 200)
                    Resource.Success(result.data)
                else
                    Resource.Error(result.msg)
            } catch (e: Throwable) {
                Resource.Error(e.toString())
            }
            emit(resource)
        }

    }

    override suspend fun getSubCatId(catId: Int): Flow<Resource<ArrayList<PropertiesData>>> {
        return flow {
            emit(Resource.Loading)
            val resource = try {
                val result = apiService.getSubCatId(catId = catId)
                if (result.code == 200)
                    Resource.Success(result.data)
                else
                    Resource.Error(result.msg)
            } catch (e: Throwable) {
                Resource.Error(e.toString())
            }
            emit(resource)
        }

    }

    override suspend fun getOptionsById(subId: Int): Flow<Resource<ArrayList<PropertiesData>>> {
        return flow {
            emit(Resource.Loading)
            val resource = try {
                val result = apiService.getOptionsById(subId = subId)
                if (result.code == 200)
                    Resource.Success(result.data)
                else
                    Resource.Error(result.msg)
            } catch (e: Throwable) {
                Resource.Error(e.toString())
            }
            emit(resource)
        }

    }

    override suspend fun getAll(): Int {
        return 90
    }
}