package com.jpdev.proyectoganadero.domain.model

import com.google.gson.annotations.SerializedName

data class Farm(
    @SerializedName("idFarm") var idFarm:Int = 0,
    @SerializedName("nameFarm") var nameFarm:String = "",
    @SerializedName("hectares") var hectares: Double = 0.0,
    @SerializedName("numCows") var numCows: Int = 0,
    @SerializedName("address") var address:String = "",
    @SerializedName("cattles") var cattles: MutableList<Cattle> = emptyList<Cattle>().toMutableList(),
    @SerializedName("receipts") var receipts: MutableList<Receipt> = emptyList<Receipt>().toMutableList()
)
