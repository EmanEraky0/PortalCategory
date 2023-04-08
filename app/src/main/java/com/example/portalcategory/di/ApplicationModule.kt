package com.example.portalcategory.di

import com.example.portalcategory.BuildConfig
import com.example.portalcategory.data.api.ApiService
import com.example.portalcategory.data.repo.MainRepoImpl
import com.example.portalcategory.data.repo.MainRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.Request
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class ApplicationModule {
    @Provides
    fun provideBaseUrl(): String = BuildConfig.BASE_URL


    @Provides
    @Singleton
    fun provideOkHttpClient(): OkHttpClient =
    OkHttpClient.Builder()
    .followRedirects(false)
    .addInterceptor { chain ->
        val original: Request = chain.request()
        val request: Request.Builder = original.newBuilder()
        request.apply {
            header("private-key", "3%o8i}_;3D4bF]G5@22r2)Et1&mLJ4?\$@+16")
        }
        chain.proceed(request.build())
    }
    .readTimeout(60, TimeUnit.SECONDS)
    .writeTimeout(60, TimeUnit.SECONDS)
    .connectTimeout(20, TimeUnit.SECONDS)
    .build()


    @Provides
    @Singleton
    fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit =
        Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BuildConfig.BASE_URL)
            .client(okHttpClient)
            .build()

    @Provides
    @Singleton
    fun provideApiService(retrofit: Retrofit): ApiService = retrofit.create(ApiService::class.java)

    @Provides
    @Singleton
    fun provideApiHelper(mainRepository: MainRepoImpl): MainRepository = mainRepository


}