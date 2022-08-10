package com.miqdad.android.getapiwithquery.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.miqdad.android.getapiwithquery.api.data.DataResponseItem
import com.miqdad.android.getapiwithquery.databinding.RowItemBinding

class MainAdapter :  RecyclerView.Adapter<MainAdapter.ViewHolder>() {

    private val listUser = ArrayList<DataResponseItem>()

    class ViewHolder (val itemBinding : RowItemBinding):RecyclerView.ViewHolder(itemBinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(
        RowItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemBinding.apply {
            with(listUser[position]){
                tvName.text = name
                tvEmail.text = email
                tvBody.text = body
            }
        }
    }

    override fun getItemCount(): Int = listUser.size

    fun setData(data : ArrayList<DataResponseItem>){
        this.listUser.clear()
        this.listUser.addAll(data)
    }
}