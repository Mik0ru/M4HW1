package com.example.m4hw1.data

import java.io.Serializable

data class User(
    val name : String ="",
    val email : String= "",
    val password : Int

) : Serializable
