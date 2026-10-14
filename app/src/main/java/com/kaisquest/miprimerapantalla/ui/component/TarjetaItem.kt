package com.kaisquest.miprimerapantalla.ui.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

data class TarjetaItemData(
    val titulo: String,
    val descripcion: String,
    val onBorrar: () -> Unit,
    val onVerMas: () -> Unit,

    )


@Composable
fun TarjetaItem(data: TarjetaItemData, modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
    )
    {
        Text(text = data.titulo, color = Color.Black)
        Spacer(Modifier.height(5.dp))
        Text(text = data.descripcion, color = Color.Black)
        Spacer(Modifier.height(5.dp))

        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.End) {
            Button(onClick = data.onBorrar) { Text(text = "Borrar") }
            Spacer(Modifier.width(10.dp))
            Button(onClick = data.onVerMas) { Text(text = "Ver más") }
        }


    }


}

@Preview(showBackground = true)

@Composable
fun TarjetaItemPreview() {
    TarjetaItem(
        data = TarjetaItemData(
            titulo = "Titulo",
            descripcion = "Descripcion",
            onBorrar = {},
            onVerMas = {},
        ),
        modifier = Modifier,

        )


}