package com.zerdasoftware.tekstilfactorytycoon.di

import android.app.Application
import androidx.room.Room
import com.zerdasoftware.tekstilfactorytycoon.data.repository.database.MainDatabaseRepositoryImpl
import com.zerdasoftware.tekstilfactorytycoon.data.source.local.database.AppDatabase
import com.zerdasoftware.tekstilfactorytycoon.domain.repository.database.MainDatabaseRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataRepositoryModule {

    @Provides
    @Singleton
    fun provideDatabase(app: Application): AppDatabase {
        return Room.databaseBuilder(
            app,
            AppDatabase::class.java,
            "TESTILY_FACTORY_TYCOON_DB",
        ).fallbackToDestructiveMigration().build()
    }

    @Provides
    @Singleton
    fun provideMinDataRepository(appDatabase: AppDatabase): MainDatabaseRepository = MainDatabaseRepositoryImpl(appDatabase.mainDao())
}