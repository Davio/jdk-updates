package nl.openweb.pizza.jdk

import kotlin.random.Random.Default.nextInt

fun main() {
    val i = nextInt(3)

    val s = when (i) {
        0 -> "yo"
        1 -> "ho"
        else -> "a bottle of rum"
    }

    println(s)
}