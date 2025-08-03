package com.example.pincheappdeclima.database

import androidx.room.Dao
import com.example.pincheappdeclima.entities.ClimaEntity
import kotlinx.coroutines.flow.Flow
// import retrofit2.http.Query // This import is for Retrofit, not Room. Remove if not used elsewhere for Retrofit in this file.
import androidx.room.Query // Ensure you are using androidx.room.Query
import androidx.room.Insert
import androidx.room.Delete
import androidx.room.OnConflictStrategy
import com.example.pincheappdeclima.entities.PronosticoEntity


@Dao
interface ClimaDao {

    // Clima Actual
    @Query("SELECT * FROM clima_actual WHERE ciudad = :ciudad")
    suspend fun obtenerClimaActual(ciudad: String): ClimaEntity?

    @Query("SELECT * FROM clima_actual ORDER BY fechaActualizacion DESC")
    suspend fun getAllClimasFlow(): Flow<List<ClimaEntity>> // Added suspend here

    @Query("SELECT * FROM clima_actual ORDER BY fechaActualizacion DESC")
    suspend fun getAllClimas(): List<ClimaEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertarClima(clima: ClimaEntity)

    @Delete
    suspend fun eliminarClima(clima: ClimaEntity)

    // Pronóstico
    @Query("SELECT * FROM pronostico WHERE ciudad = :ciudad")
    suspend fun getPronosticoByCiudad(ciudad: String): List<PronosticoEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertarPronostico(pronostico: PronosticoEntity)

    @Query("DELETE FROM pronostico WHERE ciudad = :ciudad")
    suspend fun eliminarPronostico(ciudad: String)

    // Utilidades
    @Query("SELECT COUNT(*) FROM clima_actual")
    suspend fun contarClimas(): Int

    @Query("SELECT COUNT(*) FROM pronostico")
    suspend fun contarPronosticos(): Int
}
