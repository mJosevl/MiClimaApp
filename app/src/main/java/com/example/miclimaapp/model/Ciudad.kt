package com.example.miclimaapp.model

data class Ciudad(
    val nombre: String,
    val fechaGuardado: Long = System.currentTimeMillis()
)
