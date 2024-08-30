package com.example.sample_2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column


import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sample_2.ui.theme.Sample_2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Sample_2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier
                        .fillMaxSize().padding(20.dp),
                    color = MaterialTheme.colorScheme.background,
                    content = {
                        var state : MutableState<Int> = remember {
                            mutableStateOf(0)
                        }
                      Column {
                          Greeting("Android" , modifier =  Modifier , state = state.value)
                          SecondCompose(state.value,
                              {
                                  state.value++;
                              }
                          )
                      }
                    }
                )
            }
        }
    }
}


@Composable
fun Greeting(name: String, modifier: Modifier , state : Int) {

   Column(
      modifier = Modifier
          .size(height = 200.dp , width = 300.dp)
          .padding(0.dp),
       verticalArrangement = Arrangement.SpaceBetween,
       horizontalAlignment = Alignment.CenterHorizontally
   ) {

       Text(
           text = "Hello $name! $state times",
//        color = Color.Blue,
           fontStyle = FontStyle.Italic,
           style = TextStyle(
               fontSize = 30.sp,
               color = Color.Green
           ),
           modifier = modifier
       )



   }
}


@Composable
fun SecondCompose(state : Int , increment :   () -> Unit ) {
    Button(
        modifier = Modifier.padding(20.dp), onClick = { increment(); }) {
        Text(text = "Click me ");

    }
}


@Preview(
    showSystemUi = true,
    widthDp = 400,
    heightDp = 600,
    showBackground = true
)

@Composable
fun seePreview() {
    Sample_2Theme {
        Greeting("Android" , modifier =  Modifier.fillMaxSize() ,state =7)
    }
}