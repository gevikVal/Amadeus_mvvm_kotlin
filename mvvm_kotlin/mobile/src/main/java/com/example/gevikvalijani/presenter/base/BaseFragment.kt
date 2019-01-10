package com.example.gevikvalijani.presenter.base

import android.arch.lifecycle.ViewModelProvider
import android.support.v4.app.Fragment
import com.example.gevikvalijani.presenter.di.Injectable
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import javax.inject.Inject

abstract class BaseFragment : Fragment(), Injectable {
    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory
    private val compositeDisposable : CompositeDisposable =  CompositeDisposable();

    fun addDisposable(disposable: Disposable?) {
        if(disposable != null){
            compositeDisposable.add(disposable);   /////fd
        }
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onResume(){
        super.onResume()
    }

    override fun onDestroy() {
        super.onDestroy()
        compositeDisposable.dispose();
    }

}