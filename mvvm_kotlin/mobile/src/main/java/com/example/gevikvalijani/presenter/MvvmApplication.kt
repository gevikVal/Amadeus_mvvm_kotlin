package com.example.gevikvalijani.presenter

import android.app.Activity
import com.example.gevikvalijani.presenter.di.component.ApplicationComponent
import com.example.gevikvalijani.presenter.di.component.DaggerApplicationComponent

import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

class MvvmApplication : android.app.Application(),HasActivityInjector
{
    @Inject lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Activity>

    override fun onCreate() {
        super.onCreate()
        getComponent().inject(this)
    }

    override fun activityInjector(): AndroidInjector<Activity> {
        return dispatchingAndroidInjector
    }

    open fun getComponent(): ApplicationComponent {
        return DaggerApplicationComponent.create()
    }
}