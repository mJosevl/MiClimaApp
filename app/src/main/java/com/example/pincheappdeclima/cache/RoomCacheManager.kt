package com.example.pincheappdeclima.cache

import android.content.Context
import com.example.pincheappdeclima.database.ClimaDatabase
import com.example.pincheappdeclima.entities.ClimaEntity
import com.example.pincheappdeclima.entities.PronosticoEntity
import kotlinx.coroutines.flow.Flow

class RoomCacheManager(context: Context) {

    private val climaDao = ClimaDatabase.getDatabase(context).climaDao()

    // Clima actual
    suspend fun obtenerClimaCache(ciudad: String): ClimaEntity? =
        climaDao.obtenerClimaActual(ciudad)

    // Make this function suspend
    suspend fun flujoTodosLosClimas(): Flow<List<ClimaEntity>> = // Add suspend keyword
        climaDao.getAllClimasFlow()

    suspend fun guardarClimaCache(clima: ClimaEntity) =
        climaDao.insertarClima(clima)

    suspend fun borrarClimaCache(clima: ClimaEntity) =
        climaDao.eliminarClima(clima)

    // Pronóstico
    suspend fun obtenerPronosticoCache(ciudad: String): List<PronosticoEntity> =
        climaDao.getPronosticoByCiudad(ciudad)

    suspend fun guardarPronosticoCache(pronostico: PronosticoEntity) =
        climaDao.insertarPronostico(pronostico)

    suspend fun borrarPronosticoCache(ciudad: String) =
        climaDao.eliminarPronostico(ciudad)

    // Utilidades
    suspend fun contarEntradasClima(): Int =
        climaDao.contarClimas()

    suspend fun contarEntradasPronostico(): Int =
        climaDao.contarPronosticos()
}
