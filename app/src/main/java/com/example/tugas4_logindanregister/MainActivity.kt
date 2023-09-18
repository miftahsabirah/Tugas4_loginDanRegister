package com.example.tugas4_logindanregister

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
//import com.example.tugas4_logindanregister.MainActivity3
//import com.example.tugas4_logindanregistaer.databinding.ActivityMain2Binding
import com.example.tugas4_logindanregister.databinding.ActivityMainBinding
import com.example.tugas4_logindanregister.MainActivity2

class MainActivity : AppCompatActivity() {
    //    private val TAG = "Tugas4"
    private lateinit var binding : ActivityMainBinding
    companion object{
        const val EXTRA_NAME = "EXT_NAME"
        const val EXTRA_EMAIL = "EXT_EMAIL"
        const val EXTRA_PHONE = "EXT_PHONE"
        const val EXTRA_PW = "EXT_PW"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            tombolRegistrasi.setOnClickListener {
                val intent = Intent(this@MainActivity, MainActivity3::class.java)
                intent.putExtra(EXTRA_NAME, addUname.text.toString())
                intent.putExtra(EXTRA_EMAIL, addEmail.text.toString())
                intent.putExtra(EXTRA_PHONE, addPhone.text.toString())
                intent.putExtra(EXTRA_PW, addPassword.text.toString())
                startActivity(intent)
            }
            clickableLogin.setOnClickListener {
                val intent = Intent(this@MainActivity, MainActivity2::class.java)
                startActivity(intent)
            }
        }

    }
}
