package com.naibeck.composeplayground_meetup.state

import androidx.compose.Composable
import androidx.compose.state
import androidx.ui.core.ContentScale
import androidx.ui.core.Modifier
import androidx.ui.core.drawShadow
import androidx.ui.foundation.Image
import androidx.ui.foundation.clickable
import androidx.ui.foundation.drawBorder
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.graphics.Color
import androidx.ui.layout.height
import androidx.ui.layout.width
import androidx.ui.res.imageResource
import androidx.ui.unit.dp
import com.naibeck.composeplayground_meetup.ComposableLayout
import com.naibeck.composeplayground_meetup.R

object ImageChangeCompose : ComposableLayout {

    @Composable
    override fun build() {
        ImageChangeSize()
    }
}

@Composable
fun ImageChangeSize() {
    val toggler = state { true }
    val image = imageResource(id = R.drawable.pug)
    Image(
        image,
        modifier = Modifier
            .height(if (toggler.value) 200.dp else 300.dp)
            .width(if (toggler.value) 200.dp else 300.dp)
            .drawShadow(
                elevation = 8.dp,
                shape = RoundedCornerShape(100.dp)
            )
            .clickable(onClick = { toggler.value = !toggler.value })
            .drawBorder(size = 2.dp, color = Color.White, shape = RoundedCornerShape(100.dp)),
        contentScale = ContentScale.Crop
    )
}
