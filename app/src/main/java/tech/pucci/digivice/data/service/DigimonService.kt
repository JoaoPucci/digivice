package tech.pucci.digivice.data.service

import retrofit2.http.GET
import tech.pucci.digivice.data.dto.DigimonDto

interface DigimonService {

    @GET("digimon")
    suspend fun list(): List<DigimonDto>
}
