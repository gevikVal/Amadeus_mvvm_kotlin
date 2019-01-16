package com.example.gevikvalijani.presenter.car

import android.arch.lifecycle.ViewModel
import com.example.gevikvalijani.domain.usecases.CarUseCase
import javax.inject.Inject

class CarViewModel @Inject constructor(private val carUseCase: CarUseCase) : ViewModel() {
    fun get() {
          carUseCase.getCars()
    }
}