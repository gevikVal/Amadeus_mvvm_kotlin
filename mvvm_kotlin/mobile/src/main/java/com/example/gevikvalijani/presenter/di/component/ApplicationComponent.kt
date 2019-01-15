package com.example.gevikvalijani.presenter.di.component

import com.example.gevikvalijani.presenter.MvvmApplication
import com.example.gevikvalijani.presenter.di.module.ActivityModule
import com.example.gevikvalijani.presenter.di.module.CarModule
import com.example.gevikvalijani.presenter.di.module.NetworkModule
import com.example.gevikvalijani.presenter.di.module.ViewModelModule
import dagger.Component
import dagger.android.AndroidInjector
import javax.inject.Singleton
@Component(modules = [ActivityModule::class,NetworkModule::class,CarModule::class, ViewModelModule::class])
@Singleton
interface ApplicationComponent : AndroidInjector<MvvmApplication>