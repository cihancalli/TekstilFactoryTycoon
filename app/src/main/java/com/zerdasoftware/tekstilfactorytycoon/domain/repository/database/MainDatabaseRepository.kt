package com.zerdasoftware.tekstilfactorytycoon.domain.repository.database

import com.zerdasoftware.tekstilfactorytycoon.domain.entity.MainEntity

interface MainDatabaseRepository {

    suspend fun insertMainRepository(mainEntity: MainEntity)

    suspend fun getMainRepository() : MainEntity
}