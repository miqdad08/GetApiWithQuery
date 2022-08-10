package com.miqdad.android.getapiwithquery.api.network

import com.miqdad.android.getapiwithquery.api.data.DataResponse
import com.miqdad.android.getapiwithquery.api.data.DataResponseItem
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface ApiService {
//
//    @GET("search/users")
////    @Headers("Authorization: token YOUR TOKEN")
//    fun getUsersBySearch(
//        @Query("q") username : String,
//    ): Call<UsersResponse>

    @GET("comments")
    fun getId(
        @Query("postId") id : String,
    ): Call<ArrayList<DataResponseItem>>


}