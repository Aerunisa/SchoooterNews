package com.aeruschooters.newsapschooter.data.remote

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import com.aeruschooters.newsapschooter.data.util.Constants.Companion.BASE_URL

class NewsClient {
    companion object {
        private val retrofit by lazy {
            val client = OkHttpClient.Builder()
                .build()
            Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build()
        }

        val API: NewsAPI by lazy {
            retrofit.create(NewsAPI::class.java)
        }
    }
}