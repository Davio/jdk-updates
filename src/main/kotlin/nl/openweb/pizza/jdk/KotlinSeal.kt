package nl.openweb.pizza.jdk

sealed class KotlinSeal
data class LeopardSeal(val color: String) : KotlinSeal()
data class BeardedSeal(val beardLength: Int) : KotlinSeal()
