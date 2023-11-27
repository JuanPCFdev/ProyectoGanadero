package com.jpdev.proyectoganadero.domain.model

import com.google.gson.annotations.SerializedName

data class Seller(//proveedor
    @SerializedName("idSeller") var idSeller:Int = 0,
    @SerializedName("nameSeller") var nameSeller: String = "",
    @SerializedName("telSeller") var telSeller: Int = 0
)
