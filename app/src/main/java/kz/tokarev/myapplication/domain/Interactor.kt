package kz.tokarev.myapplication.domain

import kz.tokarev.myapplication.data.MainRepository

class Interactor(val repo: MainRepository) {
    fun getFilmsDB(): List<Film> = repo.filmsDataBase
}