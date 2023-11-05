fun main() {
    val aMax = getMaxVal(10,5)
    println(aMax)

    val bMax = getMaxVal(1,5)
    println(bMax)

    println(noExplicitReturn(true))
}

fun getMaxVal(a: Int, b: Int): Int {
    return if (a > b) a
    else b
}

fun noExplicitReturn(exp: Boolean): Int =
    if (exp) {
        // It will return the last line
        "True" // unused
        5*3
    }
    else {
        "False"
        10
    }