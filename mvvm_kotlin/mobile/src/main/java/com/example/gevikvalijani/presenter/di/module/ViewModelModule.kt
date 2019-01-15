package com.example.gevikvalijani.presenter.di.module


import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import com.example.gevikvalijani.presenter.car.CarViewModel
import com.example.gevikvalijani.presenter.di.ViewModelFactory
import com.example.gevikvalijani.presenter.di.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {
    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(CarViewModel::class)
    abstract fun bindRepoViewModel(repoViewModel: CarViewModel): ViewModel
}