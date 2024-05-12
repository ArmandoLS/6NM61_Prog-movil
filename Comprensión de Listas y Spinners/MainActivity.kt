package com.example.listasyspinners;

import android.app.AlertDialog
import android.content.DialogInterface
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Corrección: Especifica el tipo de vista al que estás haciendo referencia
        val btn_welcome = findViewById<Button>(R.id.btn_welcome)
        val spinner_country = findViewById<Spinner>(R.id.spinner_country)


        val countries = arrayOf("Selecciona un país", "Mexico","brasil", "Estados Unidos", "Rusia", "Francia", "Japon", "China")

        spinner_country.adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, countries)

        btn_welcome.setOnClickListener {
            val selectedCountryIndex = spinner_country.selectedItemPosition

            if (selectedCountryIndex > 0) {
                val selectedCountry = countries[selectedCountryIndex]

                // Mostrar mensaje de bienvenida en el idioma seleccionado
                val welcomeMessage = when (selectedCountry) {
                    "Mexico" -> "¡Bienvenido!"
                    "brasil" -> "¡Bem-vindo!"
                    "Estados Unidos" -> "Welcome!"
                    "Rusia" -> "добро пожаловать!"
                    "Francia" -> "Bienvenue!"
                    "Japon" -> "いらっしゃいませ！"
                    "China" -> "欢迎！"


                    else -> ""
                }

                // Mostrar un AlertDialog con el mensaje de bienvenida
                AlertDialog.Builder(this)
                    .setTitle("Bienvenida")
                    .setMessage(welcomeMessage)
                    .setPositiveButton("OK", DialogInterface.OnClickListener { dialog, which ->
                        // Código para manejar el botón OK
                    })
                    .show()
            } else {
                Toast.makeText(this, "Selecciona un país primero", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
