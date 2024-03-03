package com.learning.diwithhilt.domain.repository

interface MyRepository {
    suspend fun doNetworkCall()
}