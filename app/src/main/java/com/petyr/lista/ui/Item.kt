package com.petyr.lista.ui

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.petyr.lista.ui.model.UIItem

@Composable
fun Item(
    item: UIItem
) {
    
    Text(text = item.label)


}