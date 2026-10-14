package com.kaisquest.miprimerapantalla.viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

data class PantallaPrincipalUIState(
    val datosTarjeta: List<DatosTarjeta> = listOf()


)

class PantallaPrincipalVM : ViewModel() {

    private val _uiState = MutableStateFlow(PantallaPrincipalUIState())
    val uiState = _uiState.asStateFlow()

    fun load() {
        //Cuando se llama a la función load se cargan los datos

        _uiState.value = _uiState.value.copy(
            datosTarjeta = listOf(


            )
        )


    }
}


data class DatosTarjeta
    (
    val titulo: String,
    val descripcion: String
)