package com.example.barcaapp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PlayersViewModel: ViewModel() {
    private val _barcaPlayers = MutableLiveData<List<String>>()
    val barcaPlayers: LiveData<List<String>> = _barcaPlayers

    init {
        _barcaPlayers.value = mutableListOf("Josue", "Anais", "Lucas", "Emma")
    }

}