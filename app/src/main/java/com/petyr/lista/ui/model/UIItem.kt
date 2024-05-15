package com.petyr.lista.ui.model

data class UIItem(
    val label: String = "Item",
) {

    companion object {
        fun getDummyList(): List<UIItem> = List(10){UIItem("Item $it")}
    }

}
