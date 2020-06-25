package com.naibeck.composeplayground_meetup.list

import androidx.compose.Composable
import androidx.ui.core.Modifier
import androidx.ui.foundation.Text
import androidx.ui.layout.Row
import androidx.ui.layout.fillMaxWidth
import androidx.ui.layout.padding
import androidx.ui.unit.dp
import com.naibeck.composeplayground_meetup.ComposableLayout

object RowStack : ComposableLayout {

    @Composable
    override fun build() {
        HorizontalStack()
    }
}

@Composable
fun HorizontalStack() {
    val names = listOf("Pedro", "Juan", "Marta")
    Row(modifier = Modifier.fillMaxWidth()) {
        names.forEach {
            Text(
                text = it,
                modifier = Modifier.padding(16.dp)
            )
        }
    }
}