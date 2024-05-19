package com.petyr.lista.ui

import android.util.Log
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.petyr.lista.ui.model.UIItem
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun Item(
    string: MutableState<String>,
    item: UIItem
) {
    val scope = rememberCoroutineScope()
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .clickable {
                string.value += item.label
                Log.d("Item", string.value)
                scope.launch {
                    delay(3000)
                    Log.d("Item", "Hello Bryj:::${item.label} Clicked")
                }
            },
        elevation = CardDefaults.cardElevation(
            defaultElevation = 6.dp
        ),
        border = BorderStroke(1.dp, Color.Black)
    ) {
        Text(
            modifier = Modifier.padding(16.dp),
            text = item.label
        )
    }
}
