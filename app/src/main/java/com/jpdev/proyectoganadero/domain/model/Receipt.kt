package com.jpdev.proyectoganadero.domain.model

import com.google.gson.annotations.SerializedName

data class Receipt(
    @SerializedName("idReceipt") var idReceipt: Int = 0,
    @SerializedName("nameReceipt") var nameReceipt: String = "",
    @SerializedName("amountPaid") var amountPaid:Double = 0.0,
    @SerializedName("date") var date: String = "",
    @SerializedName("receiptType") var receiptType:String = "",
    @SerializedName("buyer") var buyer: Buyer? = null,
    @SerializedName("seller") var seller: Seller? = null
)
