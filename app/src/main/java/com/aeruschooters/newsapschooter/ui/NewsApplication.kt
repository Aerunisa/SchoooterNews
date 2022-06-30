package com.aeruschooters.newsapschooter.ui

import android.app.Application
import com.aeruschooters.newsapschooter.data.local.ArticleDatabase
import com.aeruschooters.newsapschooter.data.repository.ArticleRepository

class NewsApplication : Application() {
    val database: ArticleRepository by lazy { ArticleRepository(ArticleDatabase(this)) }
}