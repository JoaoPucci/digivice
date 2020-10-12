package tech.pucci.digivice.data.model

import com.squareup.moshi.Json

class Digimon(
    val name: String,
    @field:Json(name = "img") val image: String,
    val level: String
) {
    override fun toString(): String {
        return "Digimon(name='$name', img='$image', level='$level')"
    }
}
