package com.naibeck.composeplayground_meetup.init

import androidx.compose.Composable
import androidx.ui.foundation.Text
import com.naibeck.composeplayground_meetup.ComposableLayout

object HelloAndroid : ComposableLayout {
    @Composable
    override fun build() {
        Greeting(name = "Android")
    }

}
@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}
