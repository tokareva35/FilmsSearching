package kz.tokarev.myapplication.di.modules

import dagger.Binds
import dagger.Module
import kz.tokarev.myapplication.utils.BindsNewClass
import kz.tokarev.myapplication.utils.BindsNewInterface

@Module
abstract class NewModule {
    @Binds
    abstract fun provideBindsNewClass(bindsNewClass: BindsNewClass): BindsNewInterface
}