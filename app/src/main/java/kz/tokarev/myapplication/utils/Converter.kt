package kz.tokarev.myapplication.utils

import kz.tokarev.myapplication.data.Entity.TmdbFilm
import kz.tokarev.myapplication.domain.Film

 object Converter {
    fun convertApiListToDTOList(list: List<TmdbFilm>?): List<Film> {
        val result = mutableListOf<Film>()
        list?.forEach {
            result.add(Film(
                title = it.title,
                poster = it.posterPath,
                description = it.overview,
                rating = it.voteAverage,
                isInFavorites = false
            ))
        }
        return result
    }
}