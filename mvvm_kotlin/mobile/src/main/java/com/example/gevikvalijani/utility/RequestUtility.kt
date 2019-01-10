package com.example.gevikvalijani.utility

import okhttp3.Request

class RequestUtility {

    companion object {
        fun addQueryParams(originalRequest: Request, queryParamsMap: Map<String, String>): Request {
            val originalHttpUrl = originalRequest.url()
            val httpUrlBuilder = originalHttpUrl.newBuilder()

            for ((key, value) in queryParamsMap) {
                httpUrlBuilder.addQueryParameter(key, value)
            }

            val httpUrl = httpUrlBuilder.build()
            val requestBuilder = originalRequest.newBuilder()
                    .url(httpUrl)

            return requestBuilder.build()
        }

        fun updateHeaders(originalRequest: Request, headersMap: Map<String, String>): Request {
            val requestBuilder = originalRequest.newBuilder()

            for ((key, value) in headersMap) {
                requestBuilder.header(key, value)
            }
            return requestBuilder.build()
        }
    }
}