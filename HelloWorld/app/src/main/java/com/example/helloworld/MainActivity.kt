package com.example.helloworld

import android.graphics.Typeface
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.helloworld.ui.theme.HelloWorldTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL

        val tv = TextView(this)
        tv.text = "Hello"
        tv.textSize = 20F
        tv.setTypeface(null, Typeface.ITALIC)

        val tv1 = TextView(this)
        tv1.text = "World"
        tv1.textSize = 20F
        tv1.setTypeface(Typeface.SERIF)

        val tv2 = TextView(this)
        tv2.text = "KSU"
        tv2.textSize = 20F
        tv2.typeface = Typeface.SANS_SERIF

        layout.addView(tv)
        layout.addView(tv1)
        layout.addView(tv2)

        setContentView(layout)
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    HelloWorldTheme {
        Greeting("Android")
    }
}