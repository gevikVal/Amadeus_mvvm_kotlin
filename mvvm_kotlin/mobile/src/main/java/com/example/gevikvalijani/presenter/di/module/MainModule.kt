package com.example.gevikvalijani.presenter.di.module

import android.content.Context
import android.content.SharedPreferences
import android.preference.PreferenceManager
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class MainModule(private val context:Context) {
    @Provides
    @Singleton
    fun provideContext() = context

    @Provides
    fun sharedPref(context: Context): SharedPreferences{
        return PreferenceManager.getDefaultSharedPreferences(context);
    }


}