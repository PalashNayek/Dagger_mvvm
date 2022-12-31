package com.example.dagger_mvvm.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.dagger_mvvm.models.Product
import com.example.dagger_mvvm.repository.ProductRepository
import kotlinx.coroutines.launch

class MainViewModel(private val repository: ProductRepository) : ViewModel() {
    val productsLiveData : LiveData<List<Product>>
    get() = repository.products

    init {
        viewModelScope.launch {
            repository.getProducts()
        }

    }
}