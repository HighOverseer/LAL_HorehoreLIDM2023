package com.example.horehorelidm.ui.register

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.horehorelidm.R
import com.example.horehorelidm.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {
    private lateinit var binding:ActivityRegisterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            tvToLogin.setOnClickListener {
                finish()
            }
        }
    }
}