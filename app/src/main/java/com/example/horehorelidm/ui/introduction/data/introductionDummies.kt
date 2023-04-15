package com.example.horehorelidm.ui.introduction.data

import com.example.horehorelidm.R
import com.example.horehorelidm.ui.introduction.models.Language

object introductionDummies {
    private val languageNames = listOf("Inggris", "Spanyol", "Jerman", "Mandarin", "Prancis", "Rusia")
    private val languageFlags = listOf(R.drawable.gb, R.drawable.es, R.drawable.de, R.drawable.cn, R.drawable.fr, R.drawable.ru)


    fun getLanguageOptionsData():List<Language>{
        val listLanguage = mutableListOf<Language>()
        for(i in 0..17){
            val newLanguage = Language(languageFlags[i%6], languageNames[i%6]);
            listLanguage.add(newLanguage)
        }
        return listLanguage
    }




}