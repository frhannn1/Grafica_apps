package intern.grafica
import android.content.Intent
import androidx.activity.ComponentActivity
import android.os.Bundle;
import android.widget.Button

class login_activity:  ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        val createButton = findViewById<Button>(R.id.createAkunButton)
        createButton.setOnClickListener {
            val intent = Intent(this, SignUp::class.java)
            startActivity(intent)
        }
    }
}