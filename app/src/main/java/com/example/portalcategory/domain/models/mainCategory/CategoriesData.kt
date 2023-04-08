package com.example.portalcategory.domain.models.mainCategory



data class CategoriesData(

   val categories: ArrayList<Categories> = arrayListOf(),
   val statistics: Statistics? = Statistics(),
//   val adsBanners: ArrayList<AdsBanners> = arrayListOf(),
//   val iosVersion: String? = null,
//   val googleVersion: String? = null,
//   val huaweiVersion: String? = null
)
