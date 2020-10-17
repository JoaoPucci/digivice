package tech.pucci.digivice.presenter.list

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import tech.pucci.digivice.data.model.Digimon
import tech.pucci.digivice.data.repository.DigimonRepository
import tech.pucci.digivice.data.repository.DigimonRepositoryImpl

class ListViewModel : ViewModel() {

    private val repository: DigimonRepository = DigimonRepositoryImpl()

    private val _digimon = MutableLiveData<List<Digimon>>()
    val digimon: LiveData<List<Digimon>>
        get() = _digimon

    private val _loading = MutableLiveData<Boolean>()
    val loading: LiveData<Boolean>
        get() = _loading

    init {
        loadDigimon()
    }

    private fun loadDigimon() {
        viewModelScope.launch {
            _loading.value = true
            _digimon.value = repository.getAll()
            _loading.value = false
        }
    }
}
