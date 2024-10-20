package com.example.tugas

import android.os.Bundle
import androidx.annotation.StringRes
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import androidx.viewpager2.widget.ViewPager2
import com.example.tugas.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    // MMengambil judul dari resource string
    companion object {
        @StringRes
        private val TAB_TITLES = intArrayOf(
            R.string.tab_register,
            R.string.tab_login
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater) // Menggunakan view binding
        setContentView(binding.root)

        val sectionsPagerAdapter = SectionsPagerAdapter(this)
        val viewPager: ViewPager2 = findViewById(R.id.view_pager) // Mengatur ViewPager2
        viewPager.adapter = sectionsPagerAdapter // Set adapter untuk ViewPager2
        val tabs: TabLayout = findViewById(R.id.tab_layout) // Menghubungkan TabLayout dengan ViewPager2
        TabLayoutMediator(tabs, viewPager) { tab, position ->
            tab.text = resources.getString(TAB_TITLES[position]) // Menampilkan judul sesuai dengan posisi tab
        }.attach()
    }
}
