package com.example.gevikvalijani.presenter.di.module

import com.example.gevikvalijani.presenter.car.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector
@Module
abstract class ActivityModule {
    @ContributesAndroidInjector
    abstract fun contributeMainAcitivityInjector(): MainActivity
}