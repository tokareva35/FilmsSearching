package kz.tokarev.myapplication.data

import io.reactivex.rxjava3.core.Observable
import kz.tokarev.myapplication.data.Entity.Film
import kz.tokarev.myapplication.data.dao.FilmDao

class MainRepository(private val filmDao: FilmDao) {

    fun putToDb(films: List<Film>) {
        filmDao.insertAll(films)
    }

    fun getAllFromDB(): Observable<List<Film>> = filmDao.getCachedFilms()

}