package com.example.portalcategory.presentation.ui.categories

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.portalcategory.data.repo.MainRepoImpl
import com.example.portalcategory.data.repo.MainRepository
import com.example.portalcategory.domain.models.mainCategory.CategoriesData
import com.example.portalcategory.domain.models.subCategory.PropertiesData
import com.example.portalcategory.utils.NetworkHelper
import com.example.portalcategory.utils.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject


@HiltViewModel
class MainViewModel @Inject constructor(
    private val repositoryUseCase: MainRepository,
) : ViewModel() {

    private var _data: MutableSharedFlow<Resource<CategoriesData>> = MutableSharedFlow()
    var data = _data.asSharedFlow()

    private var _propertiesData: MutableSharedFlow<Resource<ArrayList<PropertiesData>>> =
        MutableSharedFlow()
    var propertiesData = _propertiesData.asSharedFlow()

    private var _options: MutableSharedFlow<Resource<ArrayList<PropertiesData>>> =
        MutableSharedFlow()
    var options = _options.asSharedFlow()

//    fun getAllCats() {
//        viewModelScope.launch {
//            withContext(Dispatchers.IO) {
//                repositoryUseCase.getAllCats().collect {
//                    _data?.emit(it)
//                }
//            }
//        }
//    }

    fun getAllCats() {

        viewModelScope.launch {
            withContext(Dispatchers.Default){

//            if (networkHelper.isNetworkConnected()) {
                repositoryUseCase.getAllCats().collect {
                    _data.emit(it)
                }
//            } else _data.emit(Resource.Error("No internet connection"))
            }
        }
    }

    fun getSubCatId(catId: Int) {
        viewModelScope.launch {
//            if (networkHelper.isNetworkConnected()) {
            repositoryUseCase.getSubCatId(catId).collect {
                _propertiesData.emit(it)
            }
//            } else _propertiesData.emit(Resource.Error("No internet connection"))
        }
    }

    fun getOptionsById(subId: Int) {
        viewModelScope.launch {
//            if (networkHelper.isNetworkConnected()) {
            repositoryUseCase.getOptionsById(subId).collect {
                _options.emit(it)
            }
//            } else _options.emit(Resource.Error("No internet connection"))
        }
    }
}