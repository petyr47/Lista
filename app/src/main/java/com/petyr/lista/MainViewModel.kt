package com.petyr.lista

import androidx.lifecycle.ViewModel
import com.petyr.lista.ui.model.UIItem
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf

class MainViewModel : ViewModel() {

    val items : Flow<List<UIItem>> = flowOf(UIItem.getDummyList())
}
