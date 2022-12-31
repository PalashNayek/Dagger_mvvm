package com.example.dagger_mvvm.di

import com.example.dagger_mvvm.retrofit.FakerAPI
import com.example.dagger_mvvm.utils.Constants
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class NetworkModules {

    @Singleton
    @Provides
    fun provideRetrofit() : Retrofit{
        return Retrofit.Builder().baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Singleton
    @Provides
    fun providesFakerAPI(retrofit: Retrofit) : FakerAPI{
        return retrofit.create(FakerAPI::class.java)
    }
}