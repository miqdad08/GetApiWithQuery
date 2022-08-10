package com.miqdad.android.getapiwithquery.ui

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.miqdad.android.getapiwithquery.api.data.DataResponse
import com.miqdad.android.getapiwithquery.api.data.DataResponseItem
import com.miqdad.android.getapiwithquery.api.network.ApiClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class UserViewModel: ViewModel() {
    private val listUser = MutableLiveData<ArrayList<DataResponseItem>>()

    // fungsi untuk search
    fun searchUserApi(id: String){
        ApiClient.getApiService().getId(id).enqueue(object : Callback<ArrayList<DataResponseItem>>
        {
            override fun onResponse(
                call: Call<ArrayList<DataResponseItem>>,
                response: Response<ArrayList<DataResponseItem>>
            ) {
                listUser.value = response.body()
            }

            override fun onFailure(call: Call<ArrayList<DataResponseItem>>, t: Throwable) {

            }


        })
    }



    //fungsi buat nampilin datanya
    fun getSearchUser() : LiveData<ArrayList<DataResponseItem>> = listUser

}