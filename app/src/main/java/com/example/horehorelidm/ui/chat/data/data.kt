package com.example.horehorelidm.ui.chat.data

import com.example.horehorelidm.R
import com.example.horehorelidm.ui.chat.models.Chat

object data {
    private val photo = listOf(R.drawable.foto, R.drawable.jona, R.drawable.joni)
    private val name = listOf("Fadli", "Jona", "Joni")
    private val pesan = listOf("Besok kita jadi belajar bareng?", "Ok, ditunggu", "Terima kasih ya")

    fun getChatListData():List<Chat>{
        val listChat = mutableListOf<Chat>()
        for(i in 0..5){
            val newChat = Chat(photo[i], name[i], pesan[i]);
            listChat.add(newChat)
        }
        return listChat
    }
}