package com.example.tugas4_logindanregister

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.tugas4_logindanregister.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding : ActivityMain2Binding
    companion object{
        const val EXTRA_NAME = "EXT_NAME"
        const val EXTRA_EMAIL = "EXT_EMAIL"
        const val EXTRA_PHONE = "EXT_PHONE"
        const val EXTRA_PW = "EXT_PW"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            clickableRegister.setOnClickListener {
                val intent = Intent(this@MainActivity2, MainActivity::class.java)
                startActivity(intent)
            }
        }
    }
}
