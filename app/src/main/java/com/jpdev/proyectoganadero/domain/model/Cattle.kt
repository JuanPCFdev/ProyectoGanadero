package com.jpdev.proyectoganadero.domain.model

import com.google.gson.annotations.SerializedName

data class Cattle (
    @SerializedName("cattleId") var cattleId: Int = 0,
    @SerializedName("marking") var marking: String = "",
    @SerializedName("birthdate") var birthdate: String = "",
    @SerializedName("weight") var weight: Int = 0,
    @SerializedName("age") var age: Int = 0,
    @SerializedName("breed") var breed: String = "",
    @SerializedName("state") var state: String = "",
    @SerializedName("gender") var gender: String = ""
)