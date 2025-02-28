package com.example.elpatron.ui.theme

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import com.example.elpatron.R

class UsuarioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_usuario)

        // Vinculamos el botón de retroceso
        val btnBack: ImageButton = findViewById(R.id.btn_back)
        btnBack.setOnClickListener {
            finish() // Regresa a la actividad anterior (ActivityMenu)
        }

        // Vinculamos el botón "Editar Perfil" para navegar a EditUsuarioActivity
        val btnEditarPerfil: Button = findViewById(R.id.btn_editar_perfil)
        btnEditarPerfil.setOnClickListener {
            val intent = Intent(this, EditUsuarioActivity::class.java)
            startActivity(intent)
        }
    }
}