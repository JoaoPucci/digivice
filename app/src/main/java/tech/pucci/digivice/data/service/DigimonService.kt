package tech.pucci.digivice.data.service

import retrofit2.http.GET
import tech.pucci.digivice.data.model.Digimon

interface DigimonService {

    @GET("digimon")
    suspend fun list(): List<Digimon>
}
