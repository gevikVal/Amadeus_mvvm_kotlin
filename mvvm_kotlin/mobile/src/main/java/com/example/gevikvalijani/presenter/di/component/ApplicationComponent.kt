package com.example.gevikvalijani.presenter.di.component

import com.example.gevikvalijani.presenter.MvvmApplication
import com.example.gevikvalijani.presenter.di.module.*
import dagger.Component
import dagger.android.AndroidInjector
import javax.inject.Singleton
@Component(modules = [ActivityModule::class,NetworkModule::class,CarModule::class, ViewModelModule::class,MainModule::class])
@Singleton
interface ApplicationComponent : AndroidInjector<MvvmApplication>