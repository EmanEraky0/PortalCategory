package com.example.portalcategory.presentation.ui.details

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.portalcategory.R
import com.example.portalcategory.databinding.RowDetailsBinding

class DetailsAdapter(private val mItemsList: ArrayList<String>) :
    RecyclerView.Adapter<DetailItemViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DetailItemViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val itemBinding = DataBindingUtil.inflate<RowDetailsBinding>(
            layoutInflater,
            R.layout.row_details,
            parent,
            false
        )
        return DetailItemViewHolder(itemBinding)
    }

    override fun onBindViewHolder(
        holder: DetailItemViewHolder, position: Int
    ) {
        holder.bind(mItemsList[position])
    }

    override fun getItemCount(): Int = mItemsList.size
}