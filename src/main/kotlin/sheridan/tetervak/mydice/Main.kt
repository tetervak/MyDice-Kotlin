package sheridan.tetervak.mydice

import sheridan.tetervak.mydice.model.Dice

fun main(args: Array<String>) {
    println("Hello from My Dice Program")

    val dice = Dice()

    println("before roll: ${dice.value}");

    dice.roll()

    println("after roll: ${dice.value}");


}
