package com.example.horehorelidm.ui.mainpage.models

data class Chat(
    val photo:Int,
    val name:String,
    val pesan:String,
    val time:String,
    var hasSeen:Boolean
)