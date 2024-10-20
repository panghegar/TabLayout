package com.example.tugas

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast
import com.example.tugas.databinding.HomeActivityBinding

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: HomeActivityBinding

    // Membuat menu options
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_options, menu) // Menginflate menu dari XML
        return true
    }

    // Menangani event saat item menu dipilih
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.logout_btn -> {
                val tomain = Intent(this@HomeActivity, MainActivity::class.java) // Intent untuk logout
                startActivity(tomain)
                Toast.makeText(this, "logout", Toast.LENGTH_SHORT).show() // Menampilkan toast logout
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = HomeActivityBinding.inflate(layoutInflater) // Menggunakan view binding
        setContentView(binding.root)

        val username = intent.getStringExtra("username") // Mendapatkan data username dari intent
        binding.txtUsername.text = "$username" // Menampilkan username di TextView
    }
}
