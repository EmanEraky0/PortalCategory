package com.example.portalcategory.data.api

import com.example.portalcategory.domain.models.mainCategory.CategoriesData
import com.example.portalcategory.domain.models.GeneralResponse
import com.example.portalcategory.domain.models.subCategory.PropertiesData
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {

        @GET("get_all_cats")
        suspend fun getAllCats(): GeneralResponse<CategoriesData>

        @GET("properties")
        suspend fun getSubCatId(@Query("cat") catId: Int): GeneralResponse<ArrayList<PropertiesData>>

        @GET("get-options-child/{subId}")
        suspend fun getOptionsById(@Path("subId") subId: Int):GeneralResponse<ArrayList<PropertiesData>>

}