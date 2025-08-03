package com.example.pincheappdeclima.repository

import android.content.Context
import android.util.Log
import com.example.pincheappdeclima.api.ClimaApiService
import com.example.pincheappdeclima.api.RetrofitClient
import com.example.pincheappdeclima.model.ClimaResponse
import com.example.pincheappdeclima.model.PronosticoResponse
import com.example.pincheappdeclima.utils.NetworkManager

class ClimaRepository(private val context: Context) {

    private val api: ClimaApiService = RetrofitClient.instance.create(ClimaApiService::class.java)
    private val apiKey = "1c9df9329af5d8ae31fcb56b63a31d42"
    //private val cacheManager = CacheManager(context)
    private val appContext = context

    companion object {
        private const val TAG = "ClimaRepository"
    }

    suspend fun obtenerClima(ciudad: String): ClimaResponse {
        val response = api.getClimaPorCiudad(ciudad, apiKey)

        //validacion de internet
        val isOnline = NetworkManager.isNetworkAvailable(appContext)
        val networkType = NetworkManager.getNetworkType(appContext)

        Log.d(TAG, "Estado de red: Online=$isOnline, Tipo de red: $networkType")


        if (response.isSuccessful) {
            return response.body() ?: throw Exception("Respuesta vacía del servidor")
        } else {
            throw Exception("Error en la API: ${response.code()} - ${response.message()}")
        }
    }

    suspend fun obtenerPronostico(ciudad: String): PronosticoResponse {
        val response = api.getPronosticoPorCiudad(ciudad, apiKey)
        if (response.isSuccessful) {
            return response.body() ?: throw Exception("Respuesta vacía del servidor")
        } else {
            throw Exception("Error en la API: ${response.code()} - ${response.message()}")
        }
    }

}