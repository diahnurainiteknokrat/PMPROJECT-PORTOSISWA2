package com.uti.portosiswa

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class PrestasiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prestasi)
        supportActionBar?.title = "Prestasi"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
