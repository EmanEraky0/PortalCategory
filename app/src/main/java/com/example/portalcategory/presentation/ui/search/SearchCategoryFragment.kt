package com.example.portalcategory.presentation.ui.search

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.widget.addTextChangedListener
import androidx.navigation.fragment.findNavController
import com.example.portalcategory.R
import com.example.portalcategory.databinding.FragmentSearchCategoryBinding
import com.example.portalcategory.utils.stringOther
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class SearchCategoryFragment : BottomSheetDialogFragment() {
    private var _binding: FragmentSearchCategoryBinding? = null
    private val binding: FragmentSearchCategoryBinding get() = _binding!!

    lateinit var searchAdapter: SearchAdapter

    override fun getTheme() = R.style.CustomBottomSheetDialogTheme

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSearchCategoryBinding.inflate(inflater)

        binding.tvTitle.text = SearchCategoryFragmentArgs.fromBundle(requireArguments()).title

        var displayOptions = ArrayList<String>()
        displayOptions.add(requireContext().stringOther())
        displayOptions.addAll(SearchCategoryFragmentArgs.fromBundle(requireArguments()).options)
        searchAdapter = SearchAdapter(displayOptions, onItemClick)
        binding.recycleOptions.adapter = searchAdapter



        binding.edtSearch.addTextChangedListener { txt->
            if (txt.toString().isEmpty())
                displayOptions.addAll(displayOptions)
            else {
                val list = displayOptions.filter {
                    it.lowercase().contains(txt.toString().lowercase())
                }
                displayOptions= ArrayList()
                displayOptions.addAll(list)
            }
        }


        return binding.root
    }

    private val onItemClick: (req: String) -> Unit = { _it ->

        findNavController().previousBackStackEntry?.savedStateHandle?.set("selectType", _it)
        findNavController().popBackStack()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}