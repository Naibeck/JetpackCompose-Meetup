package com.naibeck.composeplayground_meetup.init

import com.naibeck.composeplayground_meetup.Step
import com.naibeck.composeplayground_meetup.ComposableLayout

sealed class Init(override val label: String, override val intent: ComposableLayout?) :
    Step(label, intent) {
    object HelloWorld : Init("Hello World", HelloAndroid)
}