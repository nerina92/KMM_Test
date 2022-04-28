package com.example.kmmtest.android.ui.screens.detail

import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import com.example.kmmtest.android.model.getMedia
import com.example.kmmtest.android.ui.screens.common.Thumb
import com.example.kmmtest.android.ui.screens.common.ArrowBackIcon


@Composable
fun DetailScreen(mediaId:Int, onUpClick:()->Unit){
    val mediaItem = remember { getMedia().first{it.id==mediaId}}
    Scaffold(
        topBar = {
            TopAppBar(title = { Text(text=mediaItem.title)},
            navigationIcon={ArrowBackIcon(onUpClick)})
        }

    ) {
        Thumb(mediaItem =mediaItem)
    }
    /*Box(
        modifier=Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Text(
            text="Detail Screen mediaId $mediaId",
            style = MaterialTheme.typography.h4
        )
    }*/
}

