package com.example.portalcategory.presentation.ui.categories

import com.example.portalcategory.data.api.ApiService
import com.example.portalcategory.data.repo.FakeMainRepoImpl
import com.example.portalcategory.data.repo.MainRepoImpl
import com.example.portalcategory.domain.models.mainCategory.Categories
import com.example.portalcategory.domain.models.mainCategory.CategoriesData
import com.example.portalcategory.utils.NetworkHelper
import com.example.portalcategory.utils.Resource
import io.mockk.coEvery
import io.mockk.mockk
import junit.framework.Assert.assertEquals
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.flow
import org.junit.Before
import org.junit.Test


@OptIn(ExperimentalCoroutinesApi::class)
class MainViewModelTest {
    private lateinit var viewModel: MainViewModel

    private lateinit var flow: MutableSharedFlow<Resource<CategoriesData>>

    private val apiService = mockk<ApiService>()
    private val networkHelper = mockk<NetworkHelper>()
    private val repository = mockk<MainRepoImpl>()


    @Before
    fun setup() {
        flow = MutableSharedFlow()
        viewModel = MainViewModel(repository,networkHelper)
    }


    @Test
    fun `test fetch data`() = runBlocking {
        val categories: ArrayList<Categories> = arrayListOf()
        categories.add(
            Categories(
                1,
                "سيارات ودرجات ومستلزماتها",
                null,
                "https://mazaady-test.s3.us-east-2.amazonaws.com/categories/1/o0XfOKPJ8qbPv3eTGohQ8lXafJ5nvmOJSQYIFNHW.png",
                "cars-motorcycles-accessories"
            )
        )

        val expectedOutput = listOf(
            Resource.Loading,
            Resource.Success(CategoriesData(categories))
        )
        val actualOutput = mutableListOf<Resource<CategoriesData>>()

        val expectedFlow = flow {
            emit(Resource.Loading)
            emit(Resource.Success(CategoriesData(categories)))
        }

        coEvery { repository.getAllCats() } returns expectedFlow
        viewModel.getAllCats()

//        // Wait for a longer period to ensure the coroutine has completed
//        delay(5000)

        viewModel.data?.collect{
            actualOutput.add(it)
        }
        assertEquals(expectedOutput, actualOutput)

    }
}


//    @get:Rule
//    var instantTaskExecutorRule = InstantTaskExecutorRule()
//
//    private lateinit var viewModel: MainViewModel
//
//    @Before
//    fun setup() {
//        viewModel = MainViewModel(FakeMainRepoImpl())
//    }
//
//
//    private val mockCategoriesData = CategoriesData(arrayListOf())
//
//    @Test
//    fun `emitting Resource_Success should update the flow`() = runTest {
//        // Arrange
//        val testFlow =  viewModel._data!!
//        val observer = mock(testFlow::class.java)
//
//        // Act
//        testFlow.emit(Resource.Success(mockCategoriesData))
//
//        // Assert
//        verify(observer).emit(Resource.Success(mockCategoriesData))
//        assertEquals(Resource.Success(mockCategoriesData), testFlow.replayCache.lastOrNull())
//    }
//
//    @Test
//    fun `emitting Resource_Loading should update the flow`() = runTest {
//        // Arrange
//        val testFlow =  viewModel._data!!
//        val observer = mock(testFlow::class.java)
//
//        // Act
//        testFlow.emit(Resource.Loading)
//
//        // Assert
//        verify(observer).emit(Resource.Loading)
//        assertEquals(Resource.Loading, testFlow.replayCache.lastOrNull())
//    }
//
//    @Test
//    fun `emitting Resource_Error should update the flow`() = runTest {
//        // Arrange
//        val testFlow = viewModel._data
//        val observer = mock( testFlow!!::class.java)
//        val exception = Exception("Test Exception")
//
//        // Act
//        testFlow.emit(Resource.Error(exception.message.toString()))
//
//        // Assert
//        verify(observer).emit(Resource.Error(exception.message.toString()))
//        assertEquals(Resource.Error(exception.message.toString()), testFlow.replayCache?.lastOrNull())
//    }


//    @Test
//    fun getAllCats_returnsCatResponse() = runTest {
//        viewModel.getAllCats()
//        viewModel.data?.test {
//            awaitItem() // ignore default emit (UI Empty)
//            val result = awaitItem()
//            assertThat(result).isNotNull()
//        }
//    }
//
//    @Test
//    fun getProperties_returnsPropertiesResponse() = runTest {
//        viewModel.getSubCatId(13)
//        viewModel.propertiesData.test {
//            awaitItem()
//            val result = awaitItem()
//            assertThat(result).isNotNull()
//        }
//    }
//
//    @Test
//    fun getOptions_returnsPropertiesResponse() = runTest {
//        viewModel.getOptionsById(53)
//        viewModel.options.test {
//
//            val result = awaitItem()
//            assertThat(result).isNotNull()
//        }
//    }


//}
//}