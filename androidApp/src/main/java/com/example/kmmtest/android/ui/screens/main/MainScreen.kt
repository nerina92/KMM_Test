package com.example.kmmtest.android

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.kmmtest.android.model.MediaItem

@Composable
fun MainScreen(onMediaClick:(MediaItem)->Unit) {
    MyMooviesApp {
        Scaffold(
            topBar={ MainAppBar() }
        ){
            MediaList(
                onClick = onMediaClick,
                modifier= Modifier.padding(it)
            )
        }
    }

}