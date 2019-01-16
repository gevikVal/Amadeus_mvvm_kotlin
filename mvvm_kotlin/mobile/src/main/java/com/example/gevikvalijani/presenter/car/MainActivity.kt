package com.example.gevikvalijani.presenter.car

import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import com.example.gevikvalijani.domain.usecases.CarUseCase
import com.example.gevikvalijani.presenter.R
import dagger.android.AndroidInjection

import kotlinx.android.synthetic.main.activity_main2.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject lateinit var viewModelFactory: ViewModelProvider.Factory
    lateinit var carViewModel:CarViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AndroidInjection.inject(this)
        setContentView(R.layout.activity_main2)
        setSupportActionBar(toolbar)
        carViewModel = ViewModelProviders.of(this, viewModelFactory).get(CarViewModel::class.java)
        fab.setOnClickListener {carViewModel.get()
        }
    }
}
