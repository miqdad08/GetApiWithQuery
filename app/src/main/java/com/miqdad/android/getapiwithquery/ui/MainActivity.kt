package com.miqdad.android.getapiwithquery.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.miqdad.android.getapiwithquery.api.data.DataResponseItem
import com.miqdad.android.getapiwithquery.api.network.ApiClient
import com.miqdad.android.getapiwithquery.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var _binding : ActivityMainBinding? = null
    private val binding get () = _binding as ActivityMainBinding
    private val mainAdapter = MainAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        //mendapatkan api


        //

        val viewModel = ViewModelProvider(this)[UserViewModel::class.java]

        viewModel.searchUserApi("2")

        viewModel.getSearchUser().observe(this){
            Log.i("TAG", "onCreate: $it")

//            println("Nama sayaa --->${it.items?.get(0)?.login}"
//           )
//            binding.tvName.text = it.get(1)?.name
//            binding.tvEmail.text = it.get(1)?.email
            setData(it)

        }



    }



    fun setData(data : ArrayList<DataResponseItem>){
        binding.rvData.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = mainAdapter
            mainAdapter.setData(data)
        }
    }

}