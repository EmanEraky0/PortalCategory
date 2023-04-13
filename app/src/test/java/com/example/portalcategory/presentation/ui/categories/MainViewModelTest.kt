package com.example.portalcategory.presentation.ui.categories


import com.example.portalcategory.MainCoroutineRule
import com.example.portalcategory.MainDispatcherRule
import com.example.portalcategory.data.repo.FakeMainRepoImpl
import com.example.portalcategory.domain.models.mainCategory.Categories
import com.example.portalcategory.domain.models.mainCategory.CategoriesData
import com.example.portalcategory.utils.NetworkHelper
import com.example.portalcategory.utils.Resource
import io.mockk.coEvery
import io.mockk.mockk
import junit.framework.Assert.assertEquals
import junit.framework.Assert.assertTrue
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.test.*
import org.junit.Before
import org.junit.Rule
import org.junit.Test



@OptIn(ExperimentalCoroutinesApi::class)
class MainViewModelTest {

    @get:Rule
    val mainDispatcherRule = MainDispatcherRule()

    @get:Rule
    val coroutineScope = MainCoroutineRule()

//    private val networkHelper = mockk<NetworkHelper>()
    private val repository = mockk<FakeMainRepoImpl>()

    private lateinit var viewModel: MainViewModel

    private lateinit var flow: MutableSharedFlow<Resource<CategoriesData>>



    @Before
    fun setup() {
        flow = MutableSharedFlow()
        viewModel = MainViewModel(repository)
    }


    @Test
    fun `test fetch data success`() = runTest {
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

        val actualOutput = mutableListOf<Resource<CategoriesData>>()

        val expectedFlow = flow {
            emit(Resource.Loading)
            emit(Resource.Success(CategoriesData(categories)))
        }

        coEvery { repository.getAllCats() } returns expectedFlow
        viewModel.getAllCats()

        TestCoroutineScope().advanceUntilIdle() // Wait until all coroutines have completed

        viewModel.data.collect {
            actualOutput.add(it)
        }
        assertEquals(expectedFlow, actualOutput)
    }

    @Test
    fun `test  data` () = runTest {
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
        val mockLoadResponse = Resource.Loading
        val mockSuccessResponse = Resource.Success(CategoriesData(categories))
        val mockErrorResponse = Resource.Error("Error occurred")
        val mockResourceList = listOf(mockLoadResponse ,mockSuccessResponse, mockErrorResponse)

        val resourceFlow = MutableSharedFlow<Resource<CategoriesData>>()
        launch {
            mockResourceList.forEach {
                delay(1000)
                resourceFlow.emit(it)
            }
        }

        val flowCollector = resourceFlow.take(3).toList()

        advanceTimeBy(1000)

        assertTrue( flowCollector[0] is Resource.Loading)
        advanceTimeBy(2000)

        assertTrue( flowCollector[1] is Resource.Success)


        assertTrue(flowCollector[2] is Resource.Error)
        assertEquals("Error occurred", (flowCollector[2] as Resource.Error).exception)

    }

    @Test
    fun testGetCategoriesSuccess() = coroutineScope.runBlockingTest {
        val categories: ArrayList<Categories> = arrayListOf()
        categories.add(
            Categories(
                1,
                "Cars",
                null,
                "https://example.com/cars.png",
                "cars"
            ),
        )
        categories.add(
            Categories(
                2,
                "Books",
                null,
                "https://example.com/books.png",
                "books"
            )
        )



        val expectedFlow = MutableSharedFlow<Resource<CategoriesData>>().apply {
            emit(Resource.Success(CategoriesData(categories)))
        }

        coEvery { repository.getAllCats() } returns expectedFlow


        viewModel.getAllCats()

        // Wait for the API call to complete
        delay(1000)

        // Check if the expected output matches the actual output
        val expectedOutput = expectedFlow.take(1).toList()
        assertEquals(expectedOutput, viewModel.data.take(1).toList())
    }



}

