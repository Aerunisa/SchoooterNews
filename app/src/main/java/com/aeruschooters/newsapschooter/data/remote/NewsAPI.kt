package com.aeruschooters.newsapschooter.data.remote

import com.aeruschooters.newsapschooter.data.model.News
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsAPI {
    @GET("v2/everything")
    suspend fun getNews(
        @Query("q") searchQuery: String,
        @Query("page") pageNumber: Int,
        @Query("apiKey") apiKey: String,
    ): Response<News>
}