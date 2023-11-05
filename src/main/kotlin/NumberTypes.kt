fun main() {
    val million = 1_000_000
    println(million)

    val numerator = 19
    val denominator = 10
    // truncate the result because it has Int type
    println(numerator/denominator)

    // math operation follows basic math arithmetic precedence
    println(5 + 3 * 5 / 3) // should be 8 not 13
    println((5 + 3) * 5 / 3) // should be 13 after truncate
    println((5.0 + 3) * 5 / 3) // convert one of the number to fraction number to get more precision result

    val bmi = bmiMetric(160.0, 80.0)
    println(bmi)

    intOverflow()
    longOverflow()
}

fun bmiMetric(weight: Double, height: Double): String {
    val bmi = 703.07 * weight / (height * height)
    return if (bmi < 18.5) "Underweight"
    else if (bmi < 25) "Normal weight"
    else "Overweight"
}

fun intOverflow() {
    val iMax: Int = Int.MAX_VALUE
    println("iMax: $iMax")
    println("iMax overflow: ${iMax+1}")
    println("iMax2 overflow: ${iMax+2}")

    val iMin: Int = Int.MIN_VALUE
    println("iMin: $iMin")
    println("iMin overflow: ${iMin-1}")
    println("make iMin to long to prevent overflow: ${0L + iMin - 1}")
}

fun longOverflow() {
    val lMax: Long = Long.MAX_VALUE
    println("lMax: $lMax")
    println("lMax overflow: ${lMax+1}")
    println("iMax2 overflow: ${lMax+2}")

    val lMin: Long = Long.MIN_VALUE
    println("lMin: $lMin")
    println("lMin overflow: ${lMin-1}")

    // declare long number variable
    val long = 0L
    println(long)
}