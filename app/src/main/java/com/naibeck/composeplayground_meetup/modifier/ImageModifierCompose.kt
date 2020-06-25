package com.naibeck.composeplayground_meetup.modifier

import androidx.compose.Composable
import androidx.ui.core.ContentScale
import androidx.ui.core.Modifier
import androidx.ui.core.drawShadow
import androidx.ui.foundation.Image
import androidx.ui.foundation.drawBorder
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.graphics.Color
import androidx.ui.layout.*
import androidx.ui.material.Scaffold
import androidx.ui.res.imageResource
import androidx.ui.unit.dp
import com.naibeck.composeplayground_meetup.ComposableLayout
import com.naibeck.composeplayground_meetup.R

object ImageModifierCompose : ComposableLayout {
    @Composable
    override fun build() {
        CircularImageCompose()
    }
}

@Composable
fun CircularImageCompose() {
    val image = imageResource(id = R.drawable.pug)
    Image(
        image,
        modifier = Modifier
            .height(200.dp)
            .width(200.dp)
            .drawShadow(
                elevation = 8.dp,
                shape = RoundedCornerShape(100.dp)
            )
            .drawBorder(size = 2.dp, color = Color.White, shape = RoundedCornerShape(100.dp)),
        contentScale = ContentScale.Crop
    )
}


