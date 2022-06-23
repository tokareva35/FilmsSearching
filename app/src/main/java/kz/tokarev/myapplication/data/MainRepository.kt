package kz.tokarev.myapplication.data

import androidx.lifecycle.LiveData
import kotlinx.coroutines.flow.Flow
import kz.tokarev.myapplication.data.Entity.Film
import kz.tokarev.myapplication.data.dao.FilmDao
import java.util.concurrent.Executors

class MainRepository(private val filmDao: FilmDao) {

    fun putToDb(films: List<Film>) {
        filmDao.insertAll(films)
    }

    fun getAllFromDB(): Flow<List<Film>> = filmDao.getCachedFilms()

}