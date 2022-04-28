package com.example.kmmtest.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.kmmtest.android.ui.theme.KMM_TestTheme
import com.example.kmmtest.android.ui.navigation.Navigation

class ComposeAcivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Navigation()
        }
    }

}


@Composable
fun Greeting(name: String,modifier:Modifier=Modifier) {
    Text(text = "Hello $name!",modifier=modifier)
}

//@Preview(showBackground = true, widthDp = 200, heightDp = 250)
@Composable
fun DefaultPreview() {
    KMM_TestTheme {
         Row(modifier=Modifier.fillMaxSize(),
             horizontalArrangement =Arrangement.SpaceEvenly,
             verticalAlignment = Alignment.CenterVertically){
            Greeting("Android ",
            modifier = Modifier.background(Color.Cyan))
            Greeting("Neri",
                modifier = Modifier.background(Color.Yellow))
        }

    }
}

//@Preview(showBackground = true, widthDp = 200, heightDp = 250)
@Composable
fun ButtonText() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Text(
            text="Hello world",
            modifier = Modifier
                .clickable { }
                .background(Color.LightGray)
                .border(width = 2.dp, color = Color.Black)
                .padding(horizontal = 16.dp, vertical = 8.dp)
        )
    }
}


@Composable
fun StateSample(value:String, onValueChange:(String)->Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(64.dp),
        verticalArrangement = Arrangement.Center
    ){
        TextField(
            value=value,
            onValueChange={ onValueChange },
            modifier = Modifier.fillMaxWidth()
        )
        Text(
            text=value,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Yellow)
                .padding(8.dp)
        )
        Button(
            onClick = {onValueChange("")},
            modifier = Modifier.fillMaxWidth(),
            enabled = value.isNotEmpty()//solo está activo si el texto no está vacío
        ){
            Text(text="Clear")
        }
    }
}


