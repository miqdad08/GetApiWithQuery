package com.miqdad.android.getapiwithquery.api.data

import com.google.gson.annotations.SerializedName

data class DataResponse(

	@field:SerializedName("DataResponse")
	val dataResponse: List<DataResponseItem?>? = null
)

data class DataResponseItem(

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("postId")
	val postId: Int? = null,

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("body")
	val body: String? = null,

	@field:SerializedName("email")
	val email: String? = null
)
