package com.naibeck.composeplayground_meetup.modifier

import androidx.compose.Composable
import androidx.ui.core.Modifier
import androidx.ui.foundation.Text
import androidx.ui.graphics.Color
import androidx.ui.layout.fillMaxWidth
import androidx.ui.layout.height
import androidx.ui.layout.padding
import androidx.ui.text.TextStyle
import androidx.ui.text.font.FontFamily
import androidx.ui.text.style.TextAlign
import androidx.ui.unit.TextUnit
import androidx.ui.unit.dp
import com.naibeck.composeplayground_meetup.ComposableLayout

object StylishCompose : ComposableLayout {
    @Composable
    override fun build() {
        HelloWorldModifier(name = "Android")
    }
}

@Composable
fun HelloWorldModifier(name: String) {
    Text(
        text = "Hello $name",
        style = TextStyle(
            color = Color.Red,
            fontSize = TextUnit.Companion.Sp(value = 24),
            textAlign = TextAlign.Center,
            fontFamily = FontFamily.Serif
        ),
        modifier =
        Modifier.padding(8.dp)
            .height(25.dp)
            .fillMaxWidth()
    )
}