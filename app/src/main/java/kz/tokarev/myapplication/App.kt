package kz.tokarev.myapplication

import android.app.Application
import kz.tokarev.myapplication.di.AppComponent
import kz.tokarev.myapplication.di.DaggerAppComponent

class App : Application() {
    lateinit var dagger: AppComponent

    override fun onCreate() {
        super.onCreate()
        instance = this
        //Создаем компонент
        dagger = DaggerAppComponent.create()
    }

    companion object {
        lateinit var instance: App
            private set
    }
}