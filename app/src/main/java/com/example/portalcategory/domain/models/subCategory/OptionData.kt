package com.example.portalcategory.domain.models.subCategory

data class OptionData(
    val id: Int? = null,
    val name: String? = null,
    val slug: String? = null,
    val parent: Int? = null,
    val child: Boolean? = null
)
