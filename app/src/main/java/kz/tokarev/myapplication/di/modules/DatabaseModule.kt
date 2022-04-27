package kz.tokarev.myapplication.di.modules

import dagger.Module
import dagger.Provides
import kz.tokarev.myapplication.data.MainRepository
import javax.inject.Singleton

@Module
class DatabaseModule {
    @Provides
    @Singleton
    fun provideRepository() = MainRepository()
}