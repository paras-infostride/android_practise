package com.example.sample_2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column


import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
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
                        .fillMaxSize()
                        .padding(
                            top = 40.dp,
                            start = 40.dp
                        ),
                    color = MaterialTheme.colorScheme.background,
                    content = {
                        Greeting("Android")
                    }
                )
            }
        }
    }
}


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    
   Column(
       modifier.fillMaxSize().padding(30.dp)
   ) {

       Box(modifier = modifier.size(30.dp),)
       Text(
           text = "Hello $name!",
//        color = Color.Blue,
           fontStyle = FontStyle.Italic,
           style = TextStyle(
               fontSize = 30.sp,
               color = Color.Green
           ),
           modifier = modifier
       )
     Box(modifier = modifier.size(30.dp),

         )


       Image(
           painter = painterResource(id = R.drawable.gas),
           contentDescription = "Dummy image",
           )
   }
}



@Preview(
    showSystemUi = true,
    widthDp = 600,
    heightDp = 600,
    showBackground = true
)
@Composable
fun seePreview() {
    Sample_2Theme {
        Greeting("Android")
    }
}