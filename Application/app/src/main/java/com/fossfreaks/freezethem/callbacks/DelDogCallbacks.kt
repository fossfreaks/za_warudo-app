package com.fossfreaks.freezethem.callbacks

import android.content.ClipboardManager
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.POST
import java.util.concurrent.TimeUnit

interface DelDogCallbacks {
    /*
    * @prams uploadCrashLogs
    * This method is used to uploadCrashLogs
    * */
    @POST("create")
    fun uploadCrashLogs(message:String,clipboardManager: ClipboardManager)

    companion object{
        fun create() : DelDogCallbacks{
            val httpLoggingInterceptor = HttpLoggingInterceptor()
            httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BODY

            val okHttpClient = OkHttpClient.Builder()
                .addInterceptor(httpLoggingInterceptor)
                .connectTimeout(30, TimeUnit.SECONDS)
                .readTimeout(30, TimeUnit.SECONDS)
                .writeTimeout(30, TimeUnit.SECONDS)
                .build()

            val retrofit = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://del.dog/")
                .build()
            return retrofit.create(DelDogCallbacks::class.java)
        }
    }
}