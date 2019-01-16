package com.example.gevikvalijani.presenter.di.module

import android.content.Context
import android.content.SharedPreferences
import android.content.res.Resources
import android.preference.PreferenceManager
import dagger.Module
import dagger.Provides

@Module
class AndroidModule(private var context: Context) {

    @Provides
    fun provideContext(): Context {
        return context
    }

    @Provides
    fun provideResources(context: Context): Resources {
        return context.resources
    }

    @Provides
    fun provideSharedPreferences(context: Context): SharedPreferences {
        return PreferenceManager.getDefaultSharedPreferences(context)
    }
}