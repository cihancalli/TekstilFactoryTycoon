package com.zerdasoftware.tekstilfactorytycoon.data.repository.database

import com.zerdasoftware.tekstilfactorytycoon.data.source.local.dao.MainDao
import com.zerdasoftware.tekstilfactorytycoon.domain.entity.MainEntity
import com.zerdasoftware.tekstilfactorytycoon.domain.repository.database.MainDatabaseRepository
import javax.inject.Inject

class MainDatabaseRepositoryImpl @Inject constructor(private val mainDao: MainDao) : MainDatabaseRepository {

    override suspend fun insertMainRepository(mainEntity: MainEntity) = mainDao.insertMain(mainEntity)

    override suspend fun getMainRepository(): MainEntity = mainDao.getMain()
}