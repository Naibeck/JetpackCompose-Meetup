package com.naibeck.composeplayground_meetup.list

import androidx.compose.Composable
import androidx.ui.core.Modifier
import androidx.ui.foundation.Text
import androidx.ui.graphics.Color
import androidx.ui.layout.Column
import androidx.ui.layout.fillMaxHeight
import androidx.ui.material.Divider
import com.naibeck.composeplayground_meetup.ComposableLayout

object ColumStack : ComposableLayout {

    @Composable
    override fun build() {
        VerticalStack()
    }
}

@Composable
fun VerticalStack() {
    val names = listOf("Pedro", "Juan", "Marta", "Nelson", "Marcia", "Alicia", "Gimena")
    Column(modifier = Modifier.fillMaxHeight()) {
        names.forEach {
            Text(text = it)
            Divider(color = Color.DarkGray)
        }
    }
}