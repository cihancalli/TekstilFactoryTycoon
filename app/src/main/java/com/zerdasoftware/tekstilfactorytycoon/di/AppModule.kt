package com.zerdasoftware.tekstilfactorytycoon.di

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import com.zerdasoftware.tekstilfactorytycoon.util.datastore
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideContext(@ApplicationContext context: Context) : Context = context


    @Provides
    @Singleton
    fun provideDataStore(context: Context) : DataStore<Preferences> = context.datastore

}