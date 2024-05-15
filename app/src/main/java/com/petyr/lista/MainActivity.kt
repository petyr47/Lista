package com.petyr.lista

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.petyr.lista.ui.ListScreen
import com.petyr.lista.ui.model.UIItem
import com.petyr.lista.ui.theme.ListaTheme

class MainActivity : ComponentActivity() {

    private val viewModel : MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ListaTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    topBar = {
                        Box {
                            Text(
                                modifier = Modifier.padding(16.dp),
                                text = stringResource(id = R.string.app_name),
                                fontSize = 32.sp,
                                fontWeight = FontWeight.Bold,
                            )
                        }
                    }
                ) { innerPadding ->
                    ListScreen(
                        items = viewModel.collectListState().value,
                        modifier = Modifier.padding(innerPadding),
                    )
                }
            }
        }
    }

    @Composable
    private fun MainViewModel.collectListState() : State<List<UIItem>> {
       return items.collectAsState(initial = emptyList())
    }
}
