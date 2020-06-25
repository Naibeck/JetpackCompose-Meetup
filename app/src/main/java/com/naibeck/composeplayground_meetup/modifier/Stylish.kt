package com.naibeck.composeplayground_meetup.modifier

import com.naibeck.composeplayground_meetup.ComposableLayout
import com.naibeck.composeplayground_meetup.Step

sealed class Stylish constructor(
    override val label: String,
    override val intent: ComposableLayout?
) : Step(label, intent) {
    object HelloStylish : Stylish("Hello World Modifier", StylishCompose)
    object ImageStylish : Stylish("Image Modifier", ImageModifierCompose)
}