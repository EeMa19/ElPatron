import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.ImageButton
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.viewinterop.AndroidView
import androidx.core.view.WindowCompat
import com.example.elpatron.ui.theme.ElPatronTheme
import com.example.elpatron.R // Asegúrate de que este R sea el correcto para tus recursos.
import com.example.elpatron.ui.theme.ActivityMenu


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        setContent {
            ElPatronTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(modifier: Modifier = Modifier) {
    val context = LocalContext.current

    AndroidView(factory = { context ->
        val view = LayoutInflater.from(context).inflate(R.layout.activity_main, null) // Asegúrate de que este layout contiene tu ImageButton
        val botonCont = view.findViewById<ImageButton>(R.id.botonCont)

        botonCont.setOnClickListener {
            val intent = Intent(context, ActivityMenu::class.java) // Reemplaza ActivityMenu con el nombre correcto de tu actividad
            context.startActivity(intent)
        }
        view
    })
}