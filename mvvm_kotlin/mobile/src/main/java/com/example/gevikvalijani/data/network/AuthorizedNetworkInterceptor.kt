package com.example.gevikvalijani.data.network

import android.content.Context
import com.example.gevikvalijani.presenter.R
import com.example.gevikvalijani.utility.RequestUtility
import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response
import java.util.HashMap

class AuthorizedNetworkInterceptor(private val context: Context) : Interceptor {
    private val KEY_API_KEY = "api_key"
    override fun intercept(chain: Interceptor.Chain): Response {
        if (chain != null) {
            var originalRequest: Request = chain.request()
            val queryParamsMap = HashMap<String, String>()
            queryParamsMap[KEY_API_KEY] = context.getString(R.string.api_key)
            val modifiedRequest: Request = RequestUtility.addQueryParams(originalRequest, queryParamsMap)
            return chain.proceed(modifiedRequest)
        }
        return chain
    }
}