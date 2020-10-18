package tech.pucci.digivice.data.model

import tech.pucci.digivice.R
import java.lang.IllegalStateException

enum class Level {
    FRESH, IN_TRAINING, ROOKIE, CHAMPION, ULTIMATE, MEGA, ARMOR;

    companion object {
        fun from(name: String) = when(name) {
            FRESH.toString() -> FRESH
            IN_TRAINING.toString(), "Training" -> IN_TRAINING
            ROOKIE.toString() -> ROOKIE
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
            FRESH -> R.drawable.egg
            IN_TRAINING -> R.drawable.boxing
            ROOKIE -> R.drawable.rookie
            CHAMPION -> R.drawable.champion_belt
            ULTIMATE -> R.drawable.willpower
            MEGA -> R.drawable.level_up
            ARMOR -> R.drawable.crest
        }
}
