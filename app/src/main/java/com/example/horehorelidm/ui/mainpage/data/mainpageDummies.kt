package com.example.horehorelidm.ui.mainpage.data

import com.example.horehorelidm.R
import com.example.horehorelidm.ui.mainpage.models.Discussion
import com.example.horehorelidm.ui.mainpage.models.Chat

object mainpageDummies {
    private val topics = listOf("Should I use Saya or “Aku” in a formal meeting?", "Bahasa korea dari “Aku menunggumu di stasiun”?", "Bagaimana penggunaan bahasa inggris pada surat formal?")
    private val threadStarterNames = listOf("Daniel Ricciardo", "Jenna Guivera", "Ryan Gosling")
    private val tags = listOf(listOf("Bahasa Indonesia", "Formal"), listOf("Bahasa Korea"), listOf("Bahasa Inggris"))
    private val profilePicts = listOf(R.drawable.forum_diskusi_profile_pict_1, R.drawable.forum_diskusi_profile_pict_2, R.drawable.forum_diskusi_profile_pict_3)

    private val photo = listOf(R.drawable.chat_profile_pict_1, R.drawable.chat_profile_pict_2, R.drawable.chat_profile_pict_3)
    private val name = listOf("Daniel Ricciardo", "Fiki Naki", "Francis Ngannou")
    private val pesan = listOf("Besok kita jadi belajar bareng?", "Okee, nanti ditunggu", "Makasih bantuan jawabannya")
    private val times = listOf("17.00", "13.30", "09.30")
    private val listSeens = listOf(false, false, true)

    fun getChatListData():List<Chat>{
        val listChat = mutableListOf<Chat>()
        for(i in 0..2){
            val newChat = Chat(photo[i], name[i], pesan[i], times[i], listSeens[i]);
            listChat.add(newChat)
        }
        return listChat
    }

    fun getSelectedDiscussionsData():List<Discussion>{
        val discussions = mutableListOf<Discussion>()
        for(i in 0..2){
            val tagss= mutableListOf<String>()
            for (tag in tags[i]){
                tagss.add(tag)
            }
            val newDiscussion = Discussion(threadStarterNames[i], profilePicts[i], topics[i], tagss)
            discussions.add(newDiscussion)
        }
        return discussions
    }

}