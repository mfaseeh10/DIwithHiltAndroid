package com.learning.diwithhilt.data.remote.api
import retrofit2.http.GET

interface MyApi {

    @GET("test")
    suspend fun doNetworkCall()
}