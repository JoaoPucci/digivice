package tech.pucci.digivice.data.model

import tech.pucci.digivice.R
import java.lang.IllegalStateException

enum class Level {
    FRESH, IN_TRAINING, ROOKIE, CHAMPION, ULTIMATE, MEGA, ARMOR;

    companion object {
        fun from(name: String) = when(name) {
            FRESH.toString() -> FRESH
            IN_TRAINING.toString(), "Training" -> IN_TRAINING
            ROOKIE.toString() -> IN_TRAINING
            CHAMPION.toString() -> CHAMPION
            ULTIMATE.toString() -> ULTIMATE
            MEGA.toString() -> MEGA
            ARMOR.toString() -> ARMOR
            else -> throw IllegalStateException("Wrong digimon level: $name")
        }
    }

    override fun toString() = when(this) {
        FRESH -> "Fresh"
        IN_TRAINING -> "In Training"
        ROOKIE -> "Rookie"
        CHAMPION -> "Champion"
        ULTIMATE -> "Ultimate"
        MEGA -> "Mega"
        ARMOR -> "Armor"
    }

    val drawableResource: Int
        get() = when(this) {
            FRESH -> R.drawable.boxing
            IN_TRAINING -> R.drawable.boxing
            ROOKIE -> R.drawable.boxing
            CHAMPION -> R.drawable.boxing
            ULTIMATE -> R.drawable.boxing
            MEGA -> R.drawable.boxing
            ARMOR -> R.drawable.boxing
        }
}
