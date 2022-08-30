package com.afterclass.jetpackcomposeanimation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
              JetpackCompose()
        }
    }
}

@Composable
fun JetpackCompose(){

Card {
    var expanded by remember { mutableStateOf(false)}
    Column(Modifier.clickable { expanded = !expanded }) {
        Image(painter = painterResource(id = R.drawable.jetpackcompose), contentDescription ="Image" )
        AnimatedVisibility(expanded) {

            Text(text = "Jetpack Compose",
                style = MaterialTheme.typography.h2
                )
            
        }
    }


}

}

@Preview
@Composable
fun test_JetpackCompose(){
    JetpackCompose()
}