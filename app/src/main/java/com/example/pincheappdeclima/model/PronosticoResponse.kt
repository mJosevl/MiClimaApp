package com.example.pincheappdeclima.model


data class PronosticoResponse(
    val list: List<DiaPronostico>
)

/** data class para obtener el pronóstico por día */
data class DiaPronostico(
    val dt_txt: String,
    val main: Main,
    val weather: List<Weather>
)
