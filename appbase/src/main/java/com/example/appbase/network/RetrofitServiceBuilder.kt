package com.example.appbase.network

import android.widget.Toast
import com.example.appbase.BaseApplication
import com.example.appbase.utils.NetworkUtil
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitServiceBuilder {

    fun <T> createService(clazz: Class<T>, baseApi: String = BaseApi.MAIN_API): T? {
        if (!NetworkUtil.isConnected(BaseApplication.context)) {
            Toast.makeText(BaseApplication.context, "网络未连接", Toast.LENGTH_SHORT).show()
            return null
        }
        val interceptor = HttpLoggingInterceptor { message ->
            HttpLoggingInterceptor.Logger.DEFAULT.log(message)
        }
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY)
        val client = OkHttpClient.Builder().addInterceptor(interceptor).build()
        val retrofit = Retrofit.Builder()
            .baseUrl(baseApi)
            .client(client)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        return retrofit.create(clazz)
    }
}