package kz.tokarev.remote_module.entity

import com.google.gson.annotations.SerializedName
import kz.tokarev.remote_module.entity.TmdbFilm

data class TmdbResultsDto(
    @SerializedName("page")
    val page: Int,
    @SerializedName("results")
    val tmdbFilms: List<TmdbFilm>,
    @SerializedName("total_pages")
    val totalPages: Int,
    @SerializedName("total_results")
    val totalResults: Int
)