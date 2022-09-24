package tech.pucci.digivice.data.dto

import com.squareup.moshi.Json
import tech.pucci.digivice.data.model.Digimon
import tech.pucci.digivice.data.model.Level

data class DigimonDto(
    @field:Json(name = "name") val name: String?,
    @field:Json(name = "img") val imageUrl: String?,
    @field:Json(name = "level") val level: String?
) {
    fun transform() = Digimon(name ?: "", imageUrl ?: "", Level.from(level ?: ""))
}
