package com.example.aluvery

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.aluvery.ui.theme.AluveryTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AluveryTheme() {
                Surface() {
                    MyFirstComposable()
                }
            }
        }
    }
}

@Composable
fun MyFirstComposable() {
    Text(text = "Meu Primeiro Texto")
    Text(text = "Meu segundo Texto Maior")
}

@Preview(showBackground = true)
@Composable
fun MyFirstComposablePreview() {
    Column(
        Modifier
            .background(color = Color.Blue)
            .padding(all = 24.dp)
    ) {
        Text(text = "Texto 1")
        Text(text = "Texto 2")
        Row(
            modifier = Modifier
                .padding(
                    horizontal = 8.dp,
                    vertical = 16.dp
                )
                .background(
                    Color.Green
                )
        )
        {
            Text(text = "Texto 1")
            Text(text = "Texto 2")
        }
    }
}
