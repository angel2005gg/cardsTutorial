package com.example.cards

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cards.ui.theme.CardsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CardsTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    CardMinimalCard(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

///
@Composable
fun CardMinimalCard(modifier: Modifier = Modifier) {
    Card(modifier = modifier.padding(16.dp)) {
        Text(
            text = "Hello, world card!",
            modifier = Modifier.padding(16.dp)
        )
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier.padding(16.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun CardMinimalCardPreview() {
    CardsTheme {
        CardMinimalCard()
    }
}
