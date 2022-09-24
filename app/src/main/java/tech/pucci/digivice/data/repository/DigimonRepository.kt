package tech.pucci.digivice.data.repository

import tech.pucci.digivice.data.model.Digimon

interface DigimonRepository {

    suspend fun getAll(): List<Digimon>
}
