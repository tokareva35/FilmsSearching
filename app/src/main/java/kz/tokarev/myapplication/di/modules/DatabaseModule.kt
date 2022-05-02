package kz.tokarev.myapplication.di.modules

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import kz.tokarev.myapplication.data.MainRepository
import kz.tokarev.myapplication.data.dao.FilmDao
import kz.tokarev.myapplication.data.db.AppDatabase
import javax.inject.Singleton

@Module
class DatabaseModule {
    @Singleton
    @Provides
    fun provideFilmDao(context: Context) =
        Room.databaseBuilder(
            context,
            AppDatabase::class.java,
            "film_db"
        ).build().filmDao()

    @Provides
    @Singleton
    fun provideRepository(filmDao: FilmDao) = MainRepository(filmDao)
}