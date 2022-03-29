package kz.tokarev.myapplication.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kz.tokarev.myapplication.App
import kz.tokarev.myapplication.domain.Film
import kz.tokarev.myapplication.domain.Interactor

class HomeFragmentViewModel : ViewModel() {
    val filmsListLiveData:  MutableLiveData<List<Film>> = MutableLiveData()
    //Инициализируем интерактор
    private var interactor: Interactor = App.instance.interactor

    init {
        interactor.getFilmsFromApi(1, object : ApiCallback {
            override fun onSuccess(films: List<Film>) {
                filmsListLiveData.postValue(films)
            }

            override fun onFailure() {
            }
        })
    }

    interface ApiCallback {
        fun onSuccess(films: List<Film>)
        fun onFailure()
    }
}