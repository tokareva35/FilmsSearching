package kz.tokarev.myapplication.di

import dagger.Component
import kz.tokarev.myapplication.di.modules.DatabaseModule
import kz.tokarev.myapplication.di.modules.DomainModule
import kz.tokarev.myapplication.di.modules.NewModule
import kz.tokarev.myapplication.di.modules.RemoteModule
import kz.tokarev.myapplication.viewmodel.HomeFragmentViewModel
import javax.inject.Singleton

@Singleton
@Component(
    //Внедряем все модули, нужные для этого компонента
    modules = [
        RemoteModule::class,
        DatabaseModule::class,
        DomainModule::class,
        NewModule::class
    ]
)
interface AppComponent {
    //метод для того, чтобы появилась внедрять зависимости в HomeFragmentViewModel
    fun inject(homeFragmentViewModel: HomeFragmentViewModel)
}