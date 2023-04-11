package com.example.horehorelidm.data.models

data class Discussion(
    val threadStarterName:String,
    val threadStarterProfilePic:Int,
    val topic:String,
    val tags:List<String>
)