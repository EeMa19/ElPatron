package com.example.elpatron.ui.theme

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import com.example.elpatron.R

class ActivityMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val shopButton: ImageButton = findViewById(R.id.shop)
        shopButton.setOnClickListener {
            val intent = Intent(this, ActivityPago::class.java)
            startActivity(intent)
        }
    }
}
