package com.example.tugas

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_login, container, false)

        // Listener untuk tombol login
        val loginButton: Button = view.findViewById(R.id.btn_toast)
        loginButton.setOnClickListener {
            val username = view.findViewById<EditText>(R.id.usernameEditText).text.toString()

            if (username.isNotEmpty()) {
                val intent = Intent(activity, HomeActivity::class.java) // Intent ke HomeActivity
                intent.putExtra("username", username)
                startActivity(intent)
            } else {
                Toast.makeText(activity, "Please enter a username", Toast.LENGTH_SHORT).show() // Validasi input kosong
            }
        }

        return view
    }
}
