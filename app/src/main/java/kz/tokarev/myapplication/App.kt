package kz.tokarev.myapplication

import android.app.Application
import kz.tokarev.myapplication.di.AppComponent
import kz.tokarev.myapplication.di.DaggerAppComponent
import kz.tokarev.myapplication.di.modules.DatabaseModule
import kz.tokarev.myapplication.di.modules.DomainModule
import kz.tokarev.myapplication.di.modules.RemoteModule

class App : Application() {
    lateinit var dagger: AppComponent

    override fun onCreate() {
        super.onCreate()
        instance = this
        //Создаем компонент
        dagger = DaggerAppComponent.builder()
            .remoteModule(RemoteModule())
            .databaseModule(DatabaseModule())
            .domainModule(DomainModule(this))
            .build()
    }

    companion object {
        lateinit var instance: App
            private set
    }
}