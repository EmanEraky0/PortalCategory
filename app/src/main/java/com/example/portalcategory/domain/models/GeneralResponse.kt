package com.example.portalcategory.domain.models

import com.google.gson.annotations.SerializedName

 open class GeneralResponse<T>(
    @SerializedName("data")
    val data: T,
    @SerializedName("code")
    val code: Int,
    @SerializedName("msg")
    val msg: String
)