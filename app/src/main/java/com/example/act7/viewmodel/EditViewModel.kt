package com.example.act7.viewmodel

import androidx.compose.runtime.mutableStateSetOf
import androidx.lifecycle.SavedStateHandle
import com.example.act7.repositori.RepositoriSiswa

class EditViewModel (
    savedStateHandle: SavedStateHandle,
    private val repositoriSiswa: RepositoriSiswa): ViewMode(){

    var uiStateSiswa by mutableStateSetOf(value = UIStateSiswa())
        private set

}
)