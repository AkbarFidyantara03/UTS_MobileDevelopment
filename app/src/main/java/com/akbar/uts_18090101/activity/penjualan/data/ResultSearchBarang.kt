package com.akbar.uts_18090101.activity.penjualan.data

import javax.annotation.Generated
import com.google.gson.annotations.SerializedName
import com.akbar.uts_18090101.model.Barang

@Generated("com.robohorse.robopojogenerator")
data class ResultSearchBarang(

	@field:SerializedName("barang")
	val barang: List<Barang?>? = null,

	@field:SerializedName("message")
	val message: String? = null,

	@field:SerializedName("status")
	val status: Int? = null
)