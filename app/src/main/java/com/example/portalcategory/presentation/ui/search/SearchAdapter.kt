package com.example.portalcategory.presentation.ui.search

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.portalcategory.R
import com.example.portalcategory.databinding.RowSearchBinding

class SearchAdapter(private val mItemsList: ArrayList<String>,
                      private val mItemClickListener: (String) -> Unit, ):
    RecyclerView.Adapter<SearchItemViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearchItemViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val itemBinding = DataBindingUtil.inflate<RowSearchBinding>(
            layoutInflater,
            R.layout.row_search,
            parent,
            false
        )
        return SearchItemViewHolder(itemBinding, mItemClickListener)
    }

    override fun onBindViewHolder(
        holder: SearchItemViewHolder, position: Int) {
        holder.bind(mItemsList[position])
    }

    override fun getItemCount(): Int = mItemsList.size
}