package com.example.tugas4_logindanregister

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.tugas4_logindanregister.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {
    private lateinit var binding : ActivityMain3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val uname = intent.getStringExtra(MainActivity.EXTRA_NAME)
        val email1 = intent.getStringExtra(MainActivity.EXTRA_EMAIL)
        val phone1 = intent.getStringExtra(MainActivity.EXTRA_PHONE)

        with(binding){
            username.text = uname
            email.text = email1
            phone.text = phone1

        }
    }
}