 package com.alexander.jetpackcompose2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.alexander.jetpackcompose2.ui.theme.JetpackCompose2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackCompose2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    var animals = arrayListOf(
        R.drawable.animal01, R.drawable.animal02,
        R.drawable.animal03, R.drawable.animal04,
        R.drawable.animal05, R.drawable.animal06,
        R.drawable.animal07, R.drawable.animal08,
        R.drawable.animal09, R.drawable.animal10,
        )
    var animalsname = arrayListOf(
        "Bee", "Cat", "Cow", "Crocodile", "Elephant",
        "JellyFish", "Koala", "Snake", "Turtle", "Whale"
    )
    Column(modifier = Modifier.fillMaxWidth()){
        Text(text = "Animal Collection : ")

        LazyColumn(modifier = Modifier.fillMaxHeight()){
            items(50){ index->
                Column(modifier = Modifier.fillParentMaxHeight()){
                    Text(text = animalsname[index])
                    Image(
                        painter = painterResource(id = animals[index]),
                        contentDescription = "動物",
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetpackCompose2Theme {
        Greeting("Android")
    }
}