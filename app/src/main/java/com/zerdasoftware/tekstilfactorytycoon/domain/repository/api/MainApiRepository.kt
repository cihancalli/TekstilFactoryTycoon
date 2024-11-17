package com.zerdasoftware.tekstilfactorytycoon.domain.repository.api

import com.zerdasoftware.tekstilfactorytycoon.domain.data.response.MainModelResponse

interface MainApiRepository {
    suspend fun mainApiRepository(id : Int) : MainModelResponse
}