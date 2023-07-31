package com.example.switchcomposables

import android.os.Bundle
import androidx.compose.runtime.*
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.switchcomposables.ui.theme.SwitchComposablesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SwitchComposablesTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                        MyUI()
                }
            }
        }
    }
}

@Composable
fun MyUI(){
    //The switch represents two states - ON & OFF

    var switchOn by remember{
        mutableStateOf(false)
    }

    Row() {
        Switch(checked = switchOn,
            onCheckedChange = {switchState ->
                switchOn = switchState
            },
        colors = SwitchDefaults.colors(
            checkedThumbColor = Color.Green,
            checkedTrackColor = Color.Red
        )
            )
        Text(text = "Night Mode")
    }
}

