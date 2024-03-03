package com.learning.diwithhilt.data.repository

import android.app.Application
import com.learning.diwithhilt.R
import com.learning.diwithhilt.data.remote.api.MyApi
import com.learning.diwithhilt.domain.repository.MyRepository

class MyRepositoryImpl (
    private val api: MyApi,
    private val appContext: Application
): MyRepository {

    init {
        val appName = appContext.getString(R.string.app_name)
        println("Hello from the repository. The app name is $appName")
    }

    override suspend fun doNetworkCall() {

    }
}