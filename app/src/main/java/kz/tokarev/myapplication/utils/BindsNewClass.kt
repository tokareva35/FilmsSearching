package kz.tokarev.myapplication.utils

import javax.inject.Inject

class BindsNewClass
@Inject constructor() : BindsNewInterface {
    override fun doSomething() {
        println("doSomething in bindsNewClass")
    }
}