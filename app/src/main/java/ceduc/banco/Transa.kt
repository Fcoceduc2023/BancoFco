package ceduc.banco

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast



class Transa : AppCompatActivity(){
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transa)

        val Nombre = findViewById<EditText>(R.id.txtName)
        val Cuenta = findViewById<EditText>(R.id.txtCuenta)
        val Cantidad = findViewById<EditText>(R.id.txtNumero2)
        val Transferir = findViewById<Button>(R.id.btnRestar)
        val Resultado = findViewById<TextView>(R.id.txtResultado)

        val Saldo:String = intent.getStringExtra("Saldo").orEmpty()


        //Restar

        Transferir.setOnClickListener {
           //
            val res = ((Saldo.toInt())-(Cantidad.text.toString().toInt()))
        Resultado.text = ""+(res)

            

        }







    }
}