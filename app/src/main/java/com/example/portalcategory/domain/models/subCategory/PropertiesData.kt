package com.example.portalcategory.domain.models.subCategory


data class PropertiesData(
    val id: Int? = null,
    val name: String? = null,
    val description: String? = null,
    val slug: String? = null,
    val parent: String? = null,
    val list: Boolean? = null,
    val type: String? = null,
    val value: String? = null,
    val otherValue: String? = null,
    val options: ArrayList<OptionData> = arrayListOf()
)
