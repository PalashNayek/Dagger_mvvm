package com.example.dagger_mvvm.retrofit

import com.example.dagger_mvvm.models.Product
import retrofit2.Response
import retrofit2.http.GET

interface FakerAPI {
    @GET("products")
    suspend fun getProducts() : Response<List<Product>>
}