package com.example.gevikvalijani.presenter.car

import android.arch.lifecycle.ViewModelProvider
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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AndroidInjection.inject(this)
        setContentView(R.layout.activity_main2)
        setSupportActionBar(toolbar)
        //var carUseCase :CarUseCase = CarUseCase()

       // carUseCase.getCars()

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
    }

}
