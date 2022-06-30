package kz.tokarev.myapplication

import android.app.Application
import kz.tokarev.myapplication.di.AppComponent
import kz.tokarev.myapplication.di.DaggerAppComponent
import kz.tokarev.myapplication.di.modules.DatabaseModule
import kz.tokarev.myapplication.di.modules.DomainModule
import kz.tokarev.remote_module.DaggerRemoteComponent


class App : Application() {
    lateinit var dagger: AppComponent

    override fun onCreate() {
        super.onCreate()
        instance = this
        //Создаем компонент
        val remoteProvider = DaggerRemoteComponent.create()
        dagger = DaggerAppComponent.builder()
            .remoteProvider(remoteProvider)
            .databaseModule(DatabaseModule())
            .domainModule(DomainModule(this))
            .build()
    }

    companion object {
        lateinit var instance: App
            private set
    }
}