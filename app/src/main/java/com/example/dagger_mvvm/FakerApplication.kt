package com.example.dagger_mvvm

import android.app.Application
import com.example.dagger_mvvm.di.ApplicationComponent
import com.example.dagger_mvvm.di.DaggerApplicationComponent

class FakerApplication : Application() {
    lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        applicationComponent = DaggerApplicationComponent.builder().build() //DaggerApplicationComponent.builder().build()
    }
}