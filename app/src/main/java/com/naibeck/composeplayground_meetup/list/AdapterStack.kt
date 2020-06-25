package com.naibeck.composeplayground_meetup.list

import androidx.annotation.DrawableRes
import androidx.compose.Composable
import androidx.ui.core.Alignment
import androidx.ui.core.ContentScale
import androidx.ui.core.Modifier
import androidx.ui.foundation.AdapterList
import androidx.ui.foundation.Image
import androidx.ui.foundation.Text
import androidx.ui.graphics.Color
import androidx.ui.layout.*
import androidx.ui.material.Divider
import androidx.ui.res.imageResource
import androidx.ui.res.vectorResource
import androidx.ui.unit.dp
import com.naibeck.composeplayground_meetup.ComposableLayout
import com.naibeck.composeplayground_meetup.R

object AdapterStack : ComposableLayout {

    @Composable
    override fun build() {
        SandwichListScreen()
    }
}

@Composable
fun SandwichCell(sandwich: Sandwich) {
    val resource = imageResource(id = sandwich.picture)
    val spicy = vectorResource(id = R.drawable.ic_fire)
    val unspicy = vectorResource(id = R.drawable.ic_fire_off)
    Column(
        modifier = Modifier.height(116.dp),
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Row(
            modifier = Modifier.fillMaxWidth()
                .height(100.dp)
        ) {
            Image(
                resource,
                modifier = Modifier
                    .height(100.dp)
                    .width(100.dp),
                contentScale = ContentScale.Crop
            )
            Column(modifier = Modifier.fillMaxHeight()) {
                Text(text = sandwich.name)
                Image(
                    asset = if (sandwich.spicy) spicy else unspicy,
                    modifier = Modifier
                        .height(50.dp)
                        .width(50.dp)
                        .padding(8.dp)
                )
            }
        }
        Divider(color = Color.LightGray)
    }
}

@Composable
fun SandwichListScreen() {
    val sandwiches = listOf(
        Sandwich("Ham & Cheese", R.drawable.sandwich_0, false),
        Sandwich("Meat balls", R.drawable.sandwich_1, false),
        Sandwich("Avocado & Tuna", R.drawable.sandwich_2, false),
        Sandwich("Tuna spicy", R.drawable.sandwich_3, true),
        Sandwich("Carnitas spicy", R.drawable.sandwich_4, true),
        Sandwich("Grilled Cheese", R.drawable.sandwich_5, false),
        Sandwich("Cappresse", R.drawable.sandwich_6, false),
        Sandwich("Hot BBQ", R.drawable.sandwich_7, true)
    )
    AdapterList(data = sandwiches) {
        SandwichCell(sandwich = it)
    }
}

data class Sandwich(
    val name: String,
    @DrawableRes val picture: Int,
    val spicy: Boolean
)