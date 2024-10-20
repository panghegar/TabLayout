package com.example.tugas

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

// Adapter untuk ViewPager2 yang mengatur fragment sesuai dengan tab yang dipilih
class SectionsPagerAdapter(activity: AppCompatActivity) : FragmentStateAdapter(activity) {
    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> RegisterFragment() // Fragment untuk Register
            1 -> LoginFragment() // Fragment untuk Login
            else -> throw IllegalArgumentException("Invalid position")
        }
    }

    override fun getItemCount(): Int {
        return 2 // Jumlah fragment (Register dan Login)
    }
}
