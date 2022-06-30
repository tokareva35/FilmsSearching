package kz.tokarev.remote_module

interface RemoteProvider {
    fun provideRemote(): TmdbApi
}