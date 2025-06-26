package com.uti.portosiswa

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.uti.portosiswa.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnProfil.setOnClickListener {
            startActivity(Intent(this, ProfilActivity::class.java))
        }

        binding.btnPortofolio.setOnClickListener {
            startActivity(Intent(this, PortofolioActivity::class.java))
        }

        binding.btnPrestasi.setOnClickListener {
            startActivity(Intent(this, PrestasiActivity::class.java))
        }
    }
}
