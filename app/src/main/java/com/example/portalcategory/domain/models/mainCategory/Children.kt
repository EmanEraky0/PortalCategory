package com.example.portalcategory.domain.models.mainCategory


data class Children(
    val id: Int? = null,
    val name: String? = null,
    val description: String? = null,
    val image: String? = null,
    val slug: String? = null,
    val children: String? = null,
    val circleIcon: String? = null,
    val disableShipping: Int? = null
)
