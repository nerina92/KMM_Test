package com.example.kmmtest.android


import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.kmmtest.android.model.MediaItem
import com.example.kmmtest.android.ui.screens.common.Thumb
import com.example.kmmtest.android.model.getMedia as getMedia1
import androidx.compose.material.Text


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun MediaList(
    onClick:(MediaItem)->Unit,
    modifier: Modifier = Modifier
) {
    LazyVerticalGrid(
        contentPadding= PaddingValues(6.dp),
        //calcula la cantidad de celdas por fila en base al tamaño especificado
        cells = GridCells.Adaptive(150.dp),
        modifier = modifier
    ) {
        items(getMedia1().size) { item ->
            MediaListItem(
                mediaItem = getMedia1()[item],
                onClick = { onClick(getMedia1()[item])},
                modifier=Modifier.padding(6.dp)
            )
        }
    }

}
@Composable
fun MediaListItem(mediaItem: MediaItem,
                  onClick: () -> Unit,
                  modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier.clickable { onClick() },
        elevation = 8.dp,
        shape = RoundedCornerShape(4.dp)
    ) {
        Column {
            Thumb(mediaItem)
            Title(mediaItem)
        }
    }
}

@Composable
fun Title(mediaItem: MediaItem) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxWidth()
            .background(MaterialTheme.colors.secondary)
            .padding(2.dp)
    ) {
        Text(
            text = mediaItem.title,
            style = MaterialTheme.typography.h6
        )
    }
}


