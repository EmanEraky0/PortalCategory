package com.example.portalcategory.presentation.ui.search

import androidx.recyclerview.widget.RecyclerView
import com.example.portalcategory.databinding.RowSearchBinding

class SearchItemViewHolder (
    private val itemBinding: RowSearchBinding,
    private val mItemClickListener: (String) -> Unit,

) : RecyclerView.ViewHolder(itemBinding.root) {

    private var requestItem: String? = null

    init {
        itemBinding.txtOption.setOnClickListener {
            requestItem?.let { r -> mItemClickListener(r) }
        }

    }

    fun bind(requestItem: String) {
        this.requestItem = requestItem
        itemBinding.txtOption.text = requestItem
    }
}