import androidx.compose.desktop.AppWindow
import androidx.compose.desktop.AppWindowAmbient
import androidx.compose.desktop.Window
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

fun main() = Window(title = "GitMessengerBot") {
    AppWindowAmbient.current?.window?.setSize(350, 600)

    BindView {
        SplashView()
    }
}

@Composable
private fun SplashView() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(colors.primary)
            .padding(30.dp),
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Image(
                bitmap = imageResource("ic_launcher.png"),
                modifier = Modifier.size(150.dp, 150.dp)
            )
            Text(
                text = "GitMessengerBot",
                color = Color.White,
                fontSize = 18.sp,
                modifier = Modifier.padding(top = 10.dp)
            )
        }
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text(
                text = "© 2021 지성빈 & 구환. all rights reserved.",
                color = Color.White,
                fontSize = 10.sp
            )
        }
    }
}