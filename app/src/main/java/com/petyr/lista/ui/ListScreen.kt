package com.petyr.lista.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.petyr.lista.ui.model.UIItem

@Composable
fun ListScreen(
    items: List<UIItem>,
    modifier: Modifier,
) {
    LazyColumn(
        modifier = modifier
    ) {
        items(items.size) { index ->
            Item(item = items[index])
        }
    }
}

@Preview
@Composable
fun ListPreview() {
    ListScreen(
        items = remember {
            listOf(
                UIItem(),
                UIItem(),
            )
        }, modifier = Modifier.padding(8.dp)
    )
}