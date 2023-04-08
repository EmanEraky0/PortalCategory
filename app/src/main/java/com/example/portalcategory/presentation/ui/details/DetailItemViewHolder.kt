package com.example.portalcategory.presentation.ui.details

import androidx.recyclerview.widget.RecyclerView
import com.example.portalcategory.databinding.RowDetailsBinding

class DetailItemViewHolder (
    private val itemBinding: RowDetailsBinding

) : RecyclerView.ViewHolder(itemBinding.root) {

    private var requestItem: String? = null



    fun bind(requestItem: String) {
        this.requestItem = requestItem
        itemBinding.txtUser.text =requestItem
    }
}