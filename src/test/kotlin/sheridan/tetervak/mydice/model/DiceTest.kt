package sheridan.tetervak.mydice.model

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.RepeatedTest
import org.junit.jupiter.api.assertThrows

class DiceTest {

    @BeforeEach
    fun beforeEach(){
        println("---------")
    }

    @Test
    fun initValue_12(){
        assertThrows<IllegalArgumentException>{
            val dice = Dice(12)
            println("value: ${dice.value}")
        }
    }

    @RepeatedTest(10)
    fun roll() {
        val dice = Dice()
        println("before roll: ${dice.value}");
        dice.roll()
        assertTrue(dice.value >= 1)
        assertTrue(dice.value <= 6)
        println("after roll: ${dice.value}");
    }

    @Test
    fun setValue_5() {
        val dice = Dice()
        println("before set: ${dice.value}");
        dice.value = 5
        assertEquals(5, dice.value)
    }

    @Test
    fun reset() {
        val dice = Dice(4)
        dice.roll()
        println("before reset: ${dice.value}");
        dice.reset()
        assertEquals(4, dice.value)
    }
}
