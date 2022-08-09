package com.miqdad.android.getapiwithquery.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.miqdad.android.getapiwithquery.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val usenameGit ="miqdad"

        val viewModel = ViewModelProvider(this)[UserViewModel::class.java]

        viewModel.searchUserApi(usenameGit)

        viewModel.getSearchUser().observe(this){
            Log.i("TAG", "onCreate: $it")

            println("Nama sayaa --->${it.items?.get(0)?.login}")


        }
    }
}