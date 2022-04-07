package kz.tokarev.myapplication.di.modules

import dagger.Module
import dagger.Provides
import kz.tokarev.myapplication.data.MainRepository
import kz.tokarev.myapplication.data.TmdbApi
import kz.tokarev.myapplication.domain.Interactor
import javax.inject.Singleton

@Module
class DomainModule {
    @Singleton
    @Provides
    fun provideInteractor(repository: MainRepository, tmdbApi: TmdbApi) = Interactor(repo = repository, retrofitService = tmdbApi)
}