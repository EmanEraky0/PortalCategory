package com.example.portalcategory.presentation.ui.details

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.portalcategory.databinding.FragmentCategoryDetailsBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CategoryDetailsFragment : Fragment() {

    lateinit var detailAdapter: DetailsAdapter
    private var _binding: FragmentCategoryDetailsBinding? = null
    private val binding: FragmentCategoryDetailsBinding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCategoryDetailsBinding.inflate(inflater)
        val list = ArrayList<String>()
        list.add("user1")
        list.add("user2")
        list.add("user3")
        list.add("user4")

        detailAdapter = DetailsAdapter(list)
        binding.adapter = detailAdapter
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}