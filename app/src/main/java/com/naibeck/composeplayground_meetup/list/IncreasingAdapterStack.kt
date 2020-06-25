package com.naibeck.composeplayground_meetup.list

import android.net.Uri
import androidx.compose.Composable
import androidx.compose.frames.ModelList
import androidx.compose.frames.modelListOf
import androidx.compose.remember
import androidx.compose.state
import androidx.ui.core.Modifier
import androidx.ui.foundation.AdapterList
import androidx.ui.foundation.Text
import androidx.ui.layout.Column
import androidx.ui.layout.Row
import androidx.ui.layout.fillMaxWidth
import androidx.ui.material.Button
import com.naibeck.composeplayground_meetup.ComposableLayout
import com.naibeck.composeplayground_meetup.R

object IncreasingAdapterStack : ComposableLayout {

    @Composable
    override fun build() {
        IncreasableListScreen()
    }
}

@Composable
fun IncreasableListScreen() {

    val sandwiches = modelListOf(
        Sandwich("Ham & Cheese", R.drawable.sandwich_0, false)
    )
    val count = state { 1 }
    Column(modifier = Modifier.fillMaxWidth()) {
        Row() {
            Button(onClick = {
                if (count.value >= 0) {
                    sandwiches.add(sandwichesList()[count.value])
                    count.value = count.value + 1
                }
            }, modifier = Modifier.weight(weight = 1f)) {
                Text(text = "Add Sandwich")
            }
            Button(onClick = {
                if (count.value > 0) {
                    sandwiches.removeAt(count.value - 1)
                    count.value = count.value - 1
                }
            }, modifier = Modifier.weight(weight = 1f)) {
                Text(text = "Remove Sandwich")
            }
        }

        IncreasingListStack(sandwiches = sandwiches)
    }
}

@Composable
fun IncreasingListStack(sandwiches: ModelList<Sandwich>) {
    AdapterList(data = sandwiches) {
        SandwichCell(sandwich = it)
    }
}

private fun sandwichesList() = listOf(
    Sandwich("Ham & Cheese", R.drawable.sandwich_0, false),
    Sandwich("Meat balls", R.drawable.sandwich_1, false),
    Sandwich("Avocado & Tuna", R.drawable.sandwich_2, false),
    Sandwich("Tuna spicy", R.drawable.sandwich_3, true),
    Sandwich("Carnitas spicy", R.drawable.sandwich_4, true),
    Sandwich("Grilled Cheese", R.drawable.sandwich_5, false),
    Sandwich("Cappresse", R.drawable.sandwich_6, false),
    Sandwich("Hot BBQ", R.drawable.sandwich_7, true)
)