package com.uti.portosiswa

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.uti.portosiswa.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Tombol manual
        binding.btnProfil.setOnClickListener {
            startActivity(Intent(this, ProfilActivity::class.java))
        }

        binding.btnPortofolio.setOnClickListener {
            startActivity(Intent(this, PortofolioActivity::class.java))
        }

        binding.btnPrestasi.setOnClickListener {
            startActivity(Intent(this, PrestasiActivity::class.java))
        }

        // === BOTTOM NAVIGATION ===
        val bottomNav = findViewById<BottomNavigationView>(R.id.bottom_navigation)

        bottomNav.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_home -> {
                    // Sudah di home, tidak perlu apa-apa
                    true
                }
                R.id.nav_portofolio -> {
                    startActivity(Intent(this, PortofolioActivity::class.java))
                    true
                }
                R.id.nav_prestasi -> {
                    startActivity(Intent(this, PrestasiActivity::class.java))
                    true
                }
                else -> false
            }
        }
    }
}
