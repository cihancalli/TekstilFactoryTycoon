package com.zerdasoftware.tekstilfactorytycoon.di

import com.zerdasoftware.tekstilfactorytycoon.data.repository.api.MainApiRepositoryImpl
import com.zerdasoftware.tekstilfactorytycoon.data.source.remote.api.MainApi
import com.zerdasoftware.tekstilfactorytycoon.domain.repository.api.MainApiRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    @Singleton
    fun provideAApiRepository(mainApi: MainApi) : MainApiRepository = MainApiRepositoryImpl(mainApi)
}