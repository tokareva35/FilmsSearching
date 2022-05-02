package kz.tokarev.myapplication.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kz.tokarev.myapplication.App
import kz.tokarev.myapplication.data.Entity.Film
import kz.tokarev.myapplication.domain.Interactor
import javax.inject.Inject

class FavoritesFragmentViewModel: ViewModel() {
    private val filmListLiveData = MutableLiveData<List<Film>>()

    @Inject
    lateinit var interactor : Interactor

    init {
        App.instance.dagger.inject(this)
        val films = interactor.getFilmsFromDB()
        filmListLiveData.postValue(films)
    }
}