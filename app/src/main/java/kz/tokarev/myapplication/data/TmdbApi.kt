package kz.tokarev.myapplication.data

import kz.tokarev.myapplication.data.Entity.TmdbResultsDto
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface TmdbApi {
    @GET("3/movie/{category}")
    fun getFilms(
        @Path("category") category: String,
        @Query("api_key") apiKey: String,
        @Query("language") language: String,
        @Query("page") page: Int
    ): Call<TmdbResultsDto>
}