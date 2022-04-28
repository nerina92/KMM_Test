package com.example.kmmtest.android.ui.screens.common

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayCircleOutline
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import com.example.kmmtest.android.model.MediaItem

@Composable
fun Thumb(mediaItem: MediaItem) {
    Box(
        modifier = Modifier
            .height(150.dp)
            .fillMaxWidth()
    ) {
        Image(
            painter = rememberImagePainter(
                data = mediaItem.thumb
            ),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
        if (mediaItem.type == MediaItem.Type.VIDEO) {
            Icon(
                Icons.Default.PlayCircleOutline,
                contentDescription = null,
                modifier = Modifier
                    .align(Alignment.Center),
                tint = Color.White
            )
        }
    }
}