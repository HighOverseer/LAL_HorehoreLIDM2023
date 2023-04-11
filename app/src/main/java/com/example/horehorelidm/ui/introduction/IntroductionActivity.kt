package com.example.horehorelidm.ui.introduction

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.horehorelidm.R
import com.example.horehorelidm.databinding.ActivityIntroductionBinding

class IntroductionActivity : AppCompatActivity() {

    private lateinit var binding:ActivityIntroductionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIntroductionBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}