package com.example.jetpackcomposerdemo

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposerdemo.ui.theme.JetPackComposerDemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // A surface container using the 'background' color from the theme
//            Surface(color = Color.Blue)
            MaterialTheme {
                Greeting("Android")
            }
//            }
        }
    }
}

@Preview(name = "Light Mode")
@Preview(
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    showBackground = true,
    name = "Dark Mode"
)
@Composable fun Greeting(name: String) {
    MaterialTheme {

        Row(modifier = Modifier.padding(all = 10.dp)) {
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "ImageId",
                modifier = Modifier.size(40.dp, 40.dp).clip(CircleShape).
                border(1.dp, MaterialTheme.colors.onSecondary, CircleShape))
            Spacer(modifier = Modifier.width(10.dp))
            Column {
                Text(text = "Hello Amar",
                    color = MaterialTheme.colors.secondaryVariant,
                )
                Spacer(modifier = Modifier.height(5.dp))
                Text(text = "Hello !24",
                    style = MaterialTheme.typography.body2
                )
            }
        }
    }
}

@Preview(showBackground = true) @Composable fun DefaultPreview() {
    JetPackComposerDemoTheme {
        Greeting("Android")
    }
}