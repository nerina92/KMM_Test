package com.example.kmmtest.android

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.kmmtest.android.ui.theme.KMM_TestTheme

@Composable
fun MyMooviesApp(content:@Composable ()->Unit) {
    KMM_TestTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {
            content()
        }
    }
}
