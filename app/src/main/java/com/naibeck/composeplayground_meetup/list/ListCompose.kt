package com.naibeck.composeplayground_meetup.list

import com.naibeck.composeplayground_meetup.ComposableLayout
import com.naibeck.composeplayground_meetup.Step

sealed class ListCompose(override val label: String, override val intent: ComposableLayout?) :
    Step(label, intent) {

    object ColumSample: ListCompose("Colum", ColumStack)
    object RowSample: ListCompose("Row", RowStack)
    object AdapterSample : ListCompose("Adapter", AdapterStack)
    object IncreasinfAdapterSample : ListCompose("Adapter increase", IncreasingAdapterStack)
}
