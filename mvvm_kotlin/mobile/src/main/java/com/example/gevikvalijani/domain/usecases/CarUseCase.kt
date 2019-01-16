package com.example.gevikvalijani.domain.usecases

import android.content.Context
import android.util.Log
import com.example.gevikvalijani.data.repositories.car.CarDataSourceContract
import com.example.gevikvalijani.data.response.Response
import io.reactivex.Observer
import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.observers.DisposableSingleObserver
import io.reactivex.plugins.RxJavaPlugins.onError
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject


class CarUseCase @Inject constructor(var carRepository: CarDataSourceContract.CarRepository) {

    fun getCars() {
      //  context.assets
        val disposable = carRepository.getCars(35.1504, -114.57632, 15, "2019-06-7", "2019-06-10")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(object : DisposableSingleObserver<Response>() {
                    override fun onSuccess(moviesDomainModel: Response) {
                        //                        EventBus.getDefault().post(new MessageEvent(200, "success"));
                        Log.i("gevik","success")
                    }

                    override fun onError(throwable: Throwable) {
                        //                    EventBus.getDefault().post(new MessageEvent(500, "Error"));
                        Log.i("gevik","fail")
                    }
                })
    }

}