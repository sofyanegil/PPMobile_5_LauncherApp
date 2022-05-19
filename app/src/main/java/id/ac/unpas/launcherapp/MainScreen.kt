package id.ac.unpas.launcherapp

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import id.ac.unpas.launcherapp.ui.theme.LauncherAppTheme
import kotlinx.coroutines.launch

@Composable
fun MainScreen(scaffoldState: ScaffoldState = rememberScaffoldState()) {
    val scope = rememberCoroutineScope()

    Scaffold(scaffoldState = scaffoldState) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center

        ) {
            Button(onClick = {
                scope.launch {
                    scaffoldState.snackbarHostState.showSnackbar("Hello, button diklik")
                }
            }) {
                Text(text = "Klik Saya")
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    LauncherAppTheme {
        MainScreen()
    }
}