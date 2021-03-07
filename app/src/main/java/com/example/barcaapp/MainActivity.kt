package com.example.barcaapp

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Greeting(mutableListOf("Josue", "Anais", "Lucas", "Emma"))
        }
    }
}

@Composable
fun Greeting(names: List<String>) {
    LazyColumn(
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp),
        verticalArrangement = Arrangement.spacedBy(4.dp)
        ) {
        items(names) { name ->
            Text("Hello $name")
        }
    }
 }

@Preview
@Composable
fun PreviewGreeting() {
    Greeting(mutableListOf("Josue", "Anais", "Lucas", "Emma"))
}