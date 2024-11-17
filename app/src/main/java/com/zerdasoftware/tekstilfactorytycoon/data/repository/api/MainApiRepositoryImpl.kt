package com.zerdasoftware.tekstilfactorytycoon.data.repository.api

import com.zerdasoftware.tekstilfactorytycoon.data.source.remote.api.MainApi
import com.zerdasoftware.tekstilfactorytycoon.domain.data.response.MainModelResponse
import com.zerdasoftware.tekstilfactorytycoon.domain.repository.api.MainApiRepository
import javax.inject.Inject

class MainApiRepositoryImpl @Inject constructor(private val mainApi: MainApi) : MainApiRepository {

    override suspend fun mainApiRepository(id: Int): MainModelResponse {
        return mainApi.mainApi(id)
    }
}