package nl.openweb.pizza.jdk

sealed class KotlinSeal
data class KotlinLeopardSeal(val color: String) : KotlinSeal()
data class KotlinBeardedSeal(val beardLength: Int) : KotlinSeal()
