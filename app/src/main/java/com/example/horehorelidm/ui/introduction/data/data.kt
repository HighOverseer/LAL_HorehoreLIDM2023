package com.example.horehorelidm.ui.introduction.data

import com.example.horehorelidm.R
import com.example.horehorelidm.data.models.Discussion
import com.example.horehorelidm.data.models.Language

object data {
    private val languageNames = listOf("Inggris", "Spanyol", "Jerman", "Mandarin", "Prancis", "Rusia")
    private val languageFlags = listOf(R.drawable.gb, R.drawable.es, R.drawable.de, R.drawable.cn, R.drawable.fr, R.drawable.ru)
    private val topics = listOf("Should I use Saya or “Aku” in a formal meeting?", "Bahasa korea dari “Aku menunggumu di stasiun”?", "Bagaimana penggunaan bahasa inggris pada surat formal?")
    private val threadStarterNames = listOf("Daniel Ricciardo", "Oscar Piastri", "Ahmad Fadli Ramadhan")
    private val tags = listOf(listOf("Bahasa Indonesia", "Formal"), listOf("Bahasa Korea"), listOf("Bahasa Inggris"))

    fun getLanguageOptionsData():List<Language>{
        val listLanguage = mutableListOf<Language>()
        for(i in 0..17){
            val newLanguage = Language(languageFlags[i%6], languageNames[i%6]);
            listLanguage.add(newLanguage)
        }
        return listLanguage
    }

    fun getSelectedDiscussionsData():List<Discussion>{
        val discussions = mutableListOf<Discussion>()
        for(i in 0..2){
            val tagss= mutableListOf<String>()
            for (tag in tags[i]){
                tagss.add(tag)
            }
            val newDiscussion = Discussion(threadStarterNames[i], languageFlags[i], topics[i], tagss)
            discussions.add(newDiscussion)
        }
        return discussions
    }


}