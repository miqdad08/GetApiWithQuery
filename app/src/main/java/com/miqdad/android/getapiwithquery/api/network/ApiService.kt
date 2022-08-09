package com.miqdad.android.getapiwithquery.api.network

import com.miqdad.android.getapiwithquery.api.data.UsersResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface ApiService {
    @GET("users")
    @Headers("Authorization: token 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")
    fun getListUser(): Call<ArrayList<UsersResponse>>

    @GET("search/users")
    @Headers("Authorization: token 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")
    fun getUsersBySearch(
        @Query("q") username : String,
    ): Call<UsersResponse>


}