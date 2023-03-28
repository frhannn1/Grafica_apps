package intern.grafica
import android.content.Intent
import androidx.activity.ComponentActivity
import android.os.Bundle;
import android.os.Handler;
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import intern.grafica.ui.theme.GraficaTheme
public class splash: ComponentActivity() {

    override fun onCreate(savedInstanceState:Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen)
        val handler = Handler();
        handler.postDelayed({
            val intent = Intent(this, login_activity::class.java)
            startActivity(intent)
            finish()
        },3000)
    }


}
