package algorithm

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class BubbleSortKtTest {

    @BeforeEach
    fun setUp() {
    }

    @AfterEach
    fun tearDown() {
    }

    @Test
    fun bubbleSort() {
        val arr = arrayOf(1,3,6,4)
        val res = bubbleSort(arr)
        val exp = arrayOf(1,3,4,6)
        assertArrayEquals(exp, res)
    }
}