package com.zerdasoftware.tekstilfactorytycoon.util

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.preferencesDataStore

val Context.datastore : DataStore<Preferences> by preferencesDataStore("USER_PREFERENCES")

object Keys {
    val onBoardingKey = booleanPreferencesKey("ONBOARDING")
}