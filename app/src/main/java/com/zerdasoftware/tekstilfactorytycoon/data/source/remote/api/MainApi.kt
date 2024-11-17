package com.zerdasoftware.tekstilfactorytycoon.data.source.remote.api

import com.zerdasoftware.tekstilfactorytycoon.domain.data.response.MainModelResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface MainApi {

    @GET("main/api")
    suspend fun mainApi(@Query("id") id : Int) : MainModelResponse
}

