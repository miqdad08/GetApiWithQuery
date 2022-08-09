package com.miqdad.android.getapiwithquery.ui

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.miqdad.android.getapiwithquery.api.data.ItemsItem
import com.miqdad.android.getapiwithquery.api.data.UsersResponse
import com.miqdad.android.getapiwithquery.api.network.ApiClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class UserViewModel: ViewModel() {
    private val listUser = MutableLiveData<UsersResponse>()

    // fungsi untuk search
    fun searchUserApi(username : String){
        ApiClient.getApiService().getUsersBySearch(username).enqueue(object : Callback<UsersResponse>
        {
            override fun onResponse(call: Call<UsersResponse>, response: Response<UsersResponse>?) {
                listUser.value = response?.body()
            }

            override fun onFailure(call: Call<UsersResponse>, t: Throwable) {
                Log.e("TAG", "onFailure: $t")
            }

        })
    }

    //fungsi buat nampilin datanya
    fun getSearchUser() : LiveData<UsersResponse> = listUser

}