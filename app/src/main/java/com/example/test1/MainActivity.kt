package com.example.test1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.test1.ui.theme.Test1Theme
import androidx.compose.ui.Alignment
import androidx.compose.foundation.layout.Box


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) { //main
        super.onCreate(savedInstanceState)
        setContent {
            Test1Theme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Greeting("Mita")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Surface(
            color = Color.DarkGray,
            modifier = Modifier.padding(32.dp),
            shape = MaterialTheme.shapes.extraLarge
        ) {
            Text(
                text = "Haii, nama aku $name!",
                modifier = Modifier.padding(24.dp),
                color = Color.Yellow
            )
        }
    }
}

@Preview(showBackground = true) //true berarti akan menampilkan background
@Composable
fun GreetingPreview() {
    Test1Theme {
        Greeting("Mitaa")
    }
}