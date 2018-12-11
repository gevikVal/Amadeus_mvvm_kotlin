package com.example.gevikvalijani.mvvm_kotlin.di

import android.arch.lifecycle.ViewModel
import com.example.gevikvalijani.mvvm_kotlin.Search.SearchViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(SearchViewModel::class)
    abstract fun bindingSearhcViewModel(viewModel: SearchViewModel) : ViewModel
}