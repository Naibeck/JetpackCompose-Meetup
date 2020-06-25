package com.naibeck.composeplayground_meetup.state

import androidx.compose.Composable
import androidx.compose.state
import androidx.ui.foundation.Text
import androidx.ui.material.Button
import com.naibeck.composeplayground_meetup.ComposableLayout

object ClickableCompose : ComposableLayout{

    @Composable
    override fun build() {
        val counterState = state { 0 }

        ClickCounter(count = counterState.value, updateCount = { counter ->
            counterState.value = counter
        })
    }
}

@Composable
fun ClickCounter(count: Int, updateCount: (Int) -> Unit) {
    Button(onClick = { updateCount.invoke(count.plus(other = 1)) }) {
        Text(text = "He sido clickeado $count veces")
    }
}