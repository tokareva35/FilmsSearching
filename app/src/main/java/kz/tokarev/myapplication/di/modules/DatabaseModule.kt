package kz.tokarev.myapplication.di.modules

import android.content.Context
import dagger.Module
import dagger.Provides
import kz.tokarev.myapplication.data.MainRepository
import kz.tokarev.myapplication.data.db.DatabaseHelper
import javax.inject.Singleton

@Module
class DatabaseModule {
    @Singleton
    @Provides
    fun provideDatabaseHelper(context: Context) = DatabaseHelper(context)

    @Provides
    @Singleton
    fun provideRepository(databaseHelper: DatabaseHelper) = MainRepository(databaseHelper)
}