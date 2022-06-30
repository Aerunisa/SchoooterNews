package com.aeruschooters.newsapschooter.data.repository

import com.aeruschooters.newsapschooter.data.local.ArticleDatabase
import com.aeruschooters.newsapschooter.data.model.Article
import com.aeruschooters.newsapschooter.data.remote.NewsClient
import com.aeruschooters.newsapschooter.data.util.Constants.Companion.API_KEY

class ArticleRepository(private val database: ArticleDatabase) {

    suspend fun getAllArticles(searchQuery: String, pageNumber: Int) =
        NewsClient.API.getNews(searchQuery, pageNumber, API_KEY)

    fun getFavoriteArticles() = database.articleDao().getArticles()

    suspend fun insert(article: Article) = database.articleDao().insert(article)

    suspend fun deleteArticle(article: Article) = database.articleDao().deleteArticle(article)
}