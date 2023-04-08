package intern.grafica
import android.annotation.SuppressLint
import android.content.Intent
import androidx.activity.ComponentActivity
import android.os.Bundle;
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class login_activity:  ComponentActivity() {
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        val createButton = findViewById<TextView>(R.id.daftar)
        createButton.setOnClickListener {
            val intent = Intent(this, SignUp::class.java)
            startActivity(intent)
        }
        val loginButton = findViewById<Button>(R.id.buttonLogin)
            loginButton.setOnClickListener{
                val intent = Intent(this,Dasbord::class.java)
                startActivity(intent)
            }
    }
}