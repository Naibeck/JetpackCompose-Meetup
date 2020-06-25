package com.naibeck.composeplayground_meetup

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.*
import androidx.ui.core.Modifier
import androidx.ui.core.setContent
import androidx.ui.foundation.AdapterList
import androidx.ui.foundation.Clickable
import androidx.ui.foundation.Text
import androidx.ui.layout.fillMaxWidth
import androidx.ui.layout.padding
import androidx.ui.material.ripple.ripple
import androidx.ui.unit.dp
import com.naibeck.composeplayground_meetup.state.StateCompose
import com.naibeck.composeplayground_meetup.init.Init
import com.naibeck.composeplayground_meetup.list.ListCompose
import com.naibeck.composeplayground_meetup.modifier.Stylish
import com.naibeck.composeplayground_meetup.ui.ComposePlaygroundMeetupTheme

class MainActivity : AppCompatActivity() {

    class HomeState(step: Step? = null) {
        var category by mutableStateOf(step)
    }

    private val currentState = HomeState()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val state = remember { currentState }

            ComposePlaygroundMeetupTheme {
                if (state.category == null) {
                    AdapterList(data = data) {
                        Clickable(
                            onClick = {
                                state.category = it
                            },
                            modifier = Modifier.ripple(bounded = true).fillMaxWidth()
                        ) {
                            Text(text = it.label, modifier = Modifier.padding(16.dp))
                        }
                    }
                } else {
                    state.category?.intent?.build()
                }
            }
        }
    }

    override fun onBackPressed() {
        if (currentState.category != null) {
            currentState.category = null
        } else {
            super.onBackPressed()
        }
    }

    private val data = listOf(
        Init.HelloWorld,
        Stylish.HelloStylish,
        Stylish.ImageStylish,
        StateCompose.ClickMeCounter,
        StateCompose.ImageChanger,
        ListCompose.ColumSample,
        ListCompose.RowSample,
        ListCompose.AdapterSample,
        ListCompose.IncreasinfAdapterSample
    )
}