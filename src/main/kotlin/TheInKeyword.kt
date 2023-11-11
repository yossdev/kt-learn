fun main() {
    val i1 = 11
    val i2 = 100
    val c1 = 'K'
    val c2 = 'k'
    println("$i1 ${inNumRange(i1)}")
    println("$i2 ${inNumRange(i2)}")
    println("$c1 ${notLowerCase(c1)}")
    println("$c2 ${notLowerCase(c2)}")
}

fun notLowerCase(ch: Char): Boolean = ch in 'a'..'z'
fun inNumRange(number: Number) = number in 50..100
