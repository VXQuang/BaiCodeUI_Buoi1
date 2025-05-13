package com.example.myapplication

import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import android.widget.Toast.makeText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnBack = findViewById<ImageButton>(R.id.btnBack)
        val btnEdit = findViewById<ImageButton>(R.id.btnEdit)

        btnBack.setOnClickListener {
                makeText(this, "Quay lại", Toast.LENGTH_SHORT).show()
        }

        btnEdit.setOnClickListener {
                makeText(this, "Chỉnh sửa", Toast.LENGTH_SHORT).show()
        }
    }
}
