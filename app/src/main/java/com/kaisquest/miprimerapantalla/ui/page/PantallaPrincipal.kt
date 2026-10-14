package com.kaisquest.miprimerapantalla.ui.page

import android.content.ContentValues.TAG
import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.kaisquest.miprimerapantalla.viewmodel.PantallaPrincipalVM
import androidx.lifecycle.viewmodel.compose.viewModel
import com.kaisquest.miprimerapantalla.R
import com.kaisquest.miprimerapantalla.ui.component.CabeceraImagen
import com.kaisquest.miprimerapantalla.ui.component.TarjetaItem
import com.kaisquest.miprimerapantalla.ui.component.TarjetaItemData
import com.kaisquest.miprimerapantalla.ui.component.cabeceraImagenData

@Composable
fun PantallaPrincipal(viewModel: PantallaPrincipalVM = viewModel(), modifier: Modifier = Modifier) {

    Column(modifier = modifier) {

        CabeceraImagen(
            cabeceraImagenData(
                imagen = R.drawable.cabecera, onIconoDerecho = {
                    Log.d(
                        "PantallaPrincipal",
                        "Se ha realizado un clic en el icono derecho (Compartir)"
                    )
                },
                onIconoIzquierdo = {
                    Log.d(
                        "PantallaPrincipal",
                        "Se ha realizado un clic en el icono izquierdo (Favorito)"
                    )
                })
        )

        LazyColumn(
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            items(viewModel.uiState.value.datosTarjeta) {
                item ->
                TarjetaItem(
                    data = TarjetaItemData(
                        titulo = item.titulo,
                        descripcion = item.descripcion,
                        onBorrar = { Log.d(TAG, "Se ha realizado un clic en borrar") },
                        onVerMas = { Log.d(TAG, "Se ha realizado un clic en borrar") })
                )


            }
        }


    }
}


