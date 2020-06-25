package com.naibeck.composeplayground_meetup.state

import com.naibeck.composeplayground_meetup.ComposableLayout
import com.naibeck.composeplayground_meetup.Step

sealed class StateCompose(override val label: String, override val intent: ComposableLayout?) :
    Step(label, intent) {
    object ClickMeCounter : StateCompose("Clickable counter", ClickableCompose)
    object ImageChanger : StateCompose("Toggler image", ImageChangeCompose)
}