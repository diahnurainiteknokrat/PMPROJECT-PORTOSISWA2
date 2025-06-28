package com.uti.portosiswa

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class PortofolioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_portofolio)
        supportActionBar?.title = "Portofolio"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
