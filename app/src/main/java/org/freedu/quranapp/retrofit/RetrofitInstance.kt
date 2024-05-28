package org.freedu.quranapp.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl("https://api.alquran.cloud/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    val api:QuranApiService by lazy {
        retrofit.create(QuranApiService::class.java)
    }
}