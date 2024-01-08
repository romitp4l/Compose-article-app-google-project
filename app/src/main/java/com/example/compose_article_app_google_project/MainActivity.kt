package com.example.compose_article_app_google_project

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.compose_article_app_google_project.ui.theme.ComposearticleappgoogleprojectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposearticleappgoogleprojectTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    // Greeting("Android")

                    Article(modifier = Modifier)
                }
            }
        }
    }
}

@Composable
fun Article(modifier: Modifier) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .fillMaxWidth(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val image = painterResource(id = R.drawable.bg_compose_background)
        Image(image, contentDescription = "null", modifier = Modifier.fillMaxWidth())

        // new column for the text's


        // title
        val title = "Jetpack Compose tutorial"
        Text(title, fontSize = 24.sp, modifier = Modifier.padding(16.dp) , color = Color.DarkGray ,
            fontWeight = FontWeight.ExtraBold)

        // short heading
        val shortHeading = "Jetpack Compose is a modern toolkit for " +
                "building native Android UI. Compose " +
                "simplifies and accelerates UI" +
                " development on Android with less " +
                "code, powerful tools, and intuitive Kotlin " +
                "APIs."

        Text(
            shortHeading, modifier = Modifier.padding(start = 16.dp, end = 16.dp),
            textAlign = TextAlign.Justify,
            fontWeight = FontWeight.SemiBold
        )


        // long description

        val longDescription = "In this tutorial, you build a" +
                " simple UI component with declarative functions. " +
                "You call Compose functions to say what " +
                "elements you want and the Compose compiler does the rest. " +
                "Compose is built around Composable functions. These functions let" +
                " you define your app\\'s UI programmatically because they let you describe " +
                "how it should look and provide data dependencies, rather than focus on the " +
                "process of the UI\\'s construction, such as initializing an element and then " +
                "attaching it to a parent. To create a Composable function, you add the @Composable" +
                " annotation to the function name."
        Text(longDescription, modifier = modifier.padding(16.dp),
            textAlign = TextAlign.Justify)

    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun ArticlePreview() {
    ComposearticleappgoogleprojectTheme {
        Article(modifier = Modifier)
    }
}