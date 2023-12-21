package ceduc.banco

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //Recibir datos//
        val transa = intent.getStringExtra("ingresar")
        val Trans = intent.getStringExtra("pin")

        val Saldo = findViewById<TextView>(R.id.txtSaldo)
        val Transferir = findViewById<Button>(R.id.btnTransa)

        val ingrese = findViewById<Button>(R.id.btnTransa)
        ingrese.setOnClickListener {
            val ingrese = Intent(this, Transa::class.java)
            ingrese.putExtra("Saldo", Saldo.text.toString())
            startActivity(ingrese)
        }







    }
}