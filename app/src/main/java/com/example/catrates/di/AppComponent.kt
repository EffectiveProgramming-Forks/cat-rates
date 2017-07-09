package com.example.catrates.di

import com.example.catrates.CatRatesApplication
import com.example.catrates.di.modules.AppModule
import com.example.catrates.di.modules.BuildersModule
import com.example.catrates.di.modules.CatStoreModule
import com.example.catrates.di.modules.RestModule
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(AndroidSupportInjectionModule::class,
        BuildersModule::class,
        AppModule::class,
        RestModule::class,
        CatStoreModule::class))
interface AppComponent {

    fun inject(application: CatRatesApplication)

}