package com.jpdev.proyectoganadero.domain.model

import com.google.gson.annotations.SerializedName

data class User(
    @SerializedName("userId") var userId: Int = 0,
    @SerializedName("username") var name: String = "",
    @SerializedName("password") var password: String = "",
    @SerializedName("phone") var phone: Int = 0,
    @SerializedName("farms") var farms: MutableList<Farm> = mutableListOf()
    )