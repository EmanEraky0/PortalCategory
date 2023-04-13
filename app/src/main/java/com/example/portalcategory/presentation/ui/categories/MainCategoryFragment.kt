package com.example.portalcategory.presentation.ui.categories

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.example.portalcategory.R
import com.example.portalcategory.databinding.FragmentMainCategoryBinding
import com.example.portalcategory.domain.models.mainCategory.CategoriesData
import com.example.portalcategory.domain.models.mainCategory.Children
import com.example.portalcategory.domain.models.mainCategory.PropertyTitle
import com.example.portalcategory.domain.models.subCategory.OptionData
import com.example.portalcategory.utils.Resource
import com.example.portalcategory.utils.showMessage
import com.example.portalcategory.utils.stringOther
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainCategoryFragment : Fragment() {

    private var _binding: FragmentMainCategoryBinding? = null
    private val binding: FragmentMainCategoryBinding get() = _binding!!
    private val viewModel: MainViewModel by viewModels()
    private var propertyTitle = PropertyTitle.Main

    private lateinit var categoriesData: CategoriesData
    private var mainChildren: ArrayList<Children>? = null
    private var brandOptions: ArrayList<OptionData>? = null
    private var modelOptions: ArrayList<OptionData>? = null

    private var mainCatsList: List<String> = emptyList()
    private var subCatsList: List<String> = emptyList()
    private var processTypeList: List<String> = emptyList()
    private var brandList: List<String> = emptyList()
    private var modelList: List<String> = emptyList()
    private var typeList: List<String> = emptyList()
    private var transmissionTypeList: List<String> = emptyList()
    private var fuelList: List<String> = emptyList()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMainCategoryBinding.inflate(inflater)

        setTitleAllView()
        clickComponent()
        viewModel.getAllCats()
        observeAllCategories()
        observeProperties()
        observeOptions()
        observeSelectionSearchResult()
        return binding.root
    }

    private fun setTitleAllView() {
        mainChildren = arrayListOf()
        brandOptions = arrayListOf()
        modelOptions = arrayListOf()

        binding.mainCategories.txtTitle.hint = PropertyTitle.Main.title
        binding.subCategories.txtTitle.hint = PropertyTitle.Sub.title
        binding.processType.txtTitle.hint = PropertyTitle.ProcessType.title
        binding.brand.txtTitle.hint = PropertyTitle.Brand.title
        binding.model.txtTitle.hint = PropertyTitle.Model.title
        binding.type.txtTitle.hint = PropertyTitle.Type.title
        binding.transmissionType.txtTitle.hint = PropertyTitle.TransmissionType.title
        binding.fuelType.txtTitle.hint = PropertyTitle.FuelType.title
    }

    private fun setDataBundle(title: String, arr: Array<String>): Bundle {
        val bundle = Bundle()
        bundle.putString("title", title)
        bundle.putStringArray("options", arr)
        return bundle
    }

    private fun clickComponent() {
        binding.btnSend.setOnClickListener {
            findNavController().navigate(R.id.action_mainCategory_to_detailsCategory)
        }

        binding.mainCategories.txtAuto.setOnClickListener {
            propertyTitle = PropertyTitle.Main

            findNavController().navigate(
                R.id.action_mainCategory_to_searchCategory,
                setDataBundle(PropertyTitle.Main.title, mainCatsList.toTypedArray())
            )
        }

        binding.subCategories.txtAuto.setOnClickListener {
            propertyTitle = PropertyTitle.Sub
            findNavController().navigate(
                R.id.action_mainCategory_to_searchCategory,
                setDataBundle(PropertyTitle.Sub.title, subCatsList.toTypedArray())
            )
        }

        binding.processType.txtAuto.setOnClickListener {
            propertyTitle = PropertyTitle.ProcessType
            findNavController().navigate(
                R.id.action_mainCategory_to_searchCategory,
                setDataBundle(PropertyTitle.ProcessType.title, processTypeList.toTypedArray())
            )
        }
        binding.brand.txtAuto.setOnClickListener {
            propertyTitle = PropertyTitle.Brand

            findNavController().navigate(
                R.id.action_mainCategory_to_searchCategory,
                setDataBundle(PropertyTitle.Brand.title, brandList.toTypedArray())
            )
        }
        binding.model.txtAuto.setOnClickListener {
            propertyTitle = PropertyTitle.Model

            findNavController().navigate(
                R.id.action_mainCategory_to_searchCategory,
                setDataBundle(PropertyTitle.Model.title, modelList.toTypedArray())
            )
        }
        binding.type.txtAuto.setOnClickListener {
            propertyTitle = PropertyTitle.Type

            findNavController().navigate(
                R.id.action_mainCategory_to_searchCategory,
                setDataBundle(PropertyTitle.Type.title, typeList.toTypedArray())
            )
        }
        binding.transmissionType.txtAuto.setOnClickListener {
            propertyTitle = PropertyTitle.TransmissionType

            findNavController().navigate(
                R.id.action_mainCategory_to_searchCategory,
                setDataBundle(
                    PropertyTitle.TransmissionType.title,
                    transmissionTypeList.toTypedArray()
                )
            )
        }
        binding.fuelType.txtAuto.setOnClickListener {
            propertyTitle = PropertyTitle.FuelType

            findNavController().navigate(
                R.id.action_mainCategory_to_searchCategory,
                setDataBundle(PropertyTitle.FuelType.title, fuelList.toTypedArray())
            )
        }
    }


    private fun observeAllCategories() {
        viewLifecycleOwner.lifecycleScope.launchWhenStarted {
            viewModel.data.collect {
                when (it) {
                    is Resource.Loading -> {
                        binding.loading.isVisible = true
                    }
                    is Resource.Error -> {
                        showMessage(it.exception.toString())
                    }
                    is Resource.Success -> {
                        binding.loading.isVisible = false
                        categoriesData = it.data ?: CategoriesData()
                        mainCatsList =
                            it.data?.categories?.map { it.name ?: "Nothing" } ?: arrayListOf()

                    }
                }
            }
        }

    }

    private fun observeProperties() {
        viewLifecycleOwner.lifecycleScope.launchWhenStarted {
            viewModel.propertiesData.collect { it ->
                when (it) {
                    is Resource.Loading -> {
                        binding.loading.isVisible = true
                    }
                    is Resource.Error -> {
                        showMessage(it.exception.toString())
                    }
                    is Resource.Success -> {
                        binding.loading.isVisible = false
                        it.data?.let { prop ->

                            for (i in prop) {
                                when (i.slug) {
                                    PropertyTitle.ProcessType.key -> {
                                        processTypeList = i.options.map { it.name!! }
                                    }
                                    PropertyTitle.Brand.key -> {
                                        brandList = i.options.map { it.name!! }
                                        brandOptions = i.options
                                    }
                                    PropertyTitle.TransmissionType.key -> {
                                        transmissionTypeList = i.options.map { it.name!! }
                                    }
                                    PropertyTitle.FuelType.key -> {
                                        fuelList = i.options.map { it.name!! }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private fun observeOptions() {
        viewLifecycleOwner.lifecycleScope.launchWhenStarted {
            viewModel.options.collect {
                when (it) {
                    is Resource.Loading -> {
                        binding.loading.isVisible = true
                    }
                    is Resource.Error -> {
                        showMessage(it.exception.toString())
                    }
                    is Resource.Success -> {
                        binding.loading.isVisible = false

                        when (propertyTitle) {
                            PropertyTitle.Brand -> {
                                if (it.data?.isNotEmpty() == true) {
                                    modelOptions = it.data[0].options
                                    modelList = it.data[0].options.map { it.name!! }
                                } else {
                                    modelList = arrayListOf()
                                }
                            }
                            PropertyTitle.Model -> {
                                typeList = if (it.data?.isNotEmpty() == true) {
                                    it.data[0].options.map { it.name!! }
                                } else {
                                    arrayListOf()
                                }
                            }
                            else -> {}
                        }
                    }
                }
            }
        }
    }

    private fun observeSelectionSearchResult() {
        findNavController().currentBackStackEntry?.savedStateHandle?.getLiveData<String>("selectType")
            ?.observe(
                viewLifecycleOwner
            ) { select ->
                when (propertyTitle) {
                    PropertyTitle.Main -> {
                        if (select.equals(requireContext().stringOther()))
                            binding.specifyMainCat.root.isVisible = true
                        else {
                            binding.specifyMainCat.root.isVisible = false
                            val index = mainCatsList.indexOf(select)
                            mainChildren = categoriesData.categories[index].children
                            subCatsList = mainChildren?.map { it.name!! } ?: arrayListOf()

                        }
                        binding.mainCategories.txtAuto.setText(select)
                    }

                    PropertyTitle.Sub -> {
                        if (select.equals(requireContext().stringOther())) {
                            binding.specifySubCat.root.isVisible = true
                        } else {
                            binding.subCategories.txtAuto.setText(select)
                            binding.specifySubCat.root.isVisible = false

                            val index = subCatsList.indexOf(select)
                            mainChildren?.let { children ->
                                viewModel.getSubCatId(children[index].id!!)
                            }
                        }
                        binding.subCategories.txtAuto.setText(select)
                    }

                    PropertyTitle.ProcessType -> {
                        binding.specifyProcess.root.isVisible =
                            select.equals(requireContext().stringOther())
                        binding.processType.txtAuto.setText(select)
                    }
                    PropertyTitle.Brand -> {
                        if (select.equals(requireContext().stringOther()))
                            binding.specifyBrand.root.isVisible = true
                        else {
                            binding.brand.txtAuto.setText(select)
                            binding.specifyBrand.root.isVisible = false

                            val index = brandList.indexOf(select)
                            viewModel.getOptionsById(brandOptions?.get(index)?.id!!)

                        }
                    }
                    PropertyTitle.Model -> {
                        if (select.equals(requireContext().stringOther()))
                            binding.specifyModel.root.isVisible = true
                        else {
                            binding.model.txtAuto.setText(select)
                            binding.specifyModel.root.isVisible = false
                            val index = modelList.indexOf(select)
                            viewModel.getOptionsById(modelOptions?.get(index)?.id!!)
                        }
                    }
                    PropertyTitle.Type -> {
                        binding.specifyType.root.isVisible =
                            select.equals(requireContext().stringOther())
                        binding.type.txtAuto.setText(select)
                    }
                    PropertyTitle.TransmissionType -> {
                        binding.specifyTransmissionType.root.isVisible =
                            select.equals(requireContext().stringOther())
                        binding.transmissionType.txtAuto.setText(select)
                    }
                    PropertyTitle.FuelType -> {
                        binding.specifyFuelType.root.isVisible =
                            select.equals(requireContext().stringOther())
                        binding.fuelType.txtAuto.setText(select)
                    }
                }

            }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
        mainChildren = null
        brandOptions = null
        modelOptions = null
    }
}