package ceduc.banco

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val pin = findViewById<EditText>(R.id.txtPin)
        val ingresar = findViewById<Button>(R.id.btnIn)

        //Contraseña
        val masterpassword = "1234"

        //Escuchadores
        pin.setOnClickListener{
            //cambiar de una pantalla a otra
            val intencion = Intent(this, pin::class.java)

        }


        //Cambiar de un activity a otra

        val ingrese = findViewById<Button>(R.id.btnIn)
        ingrese.setOnClickListener {
            val ingrese = Intent(this, MainActivity::class.java)
            startActivity(ingrese)
        }




    }
}