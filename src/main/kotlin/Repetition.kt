fun main() {
    var i: Int = 0
    while (i < 10) {
        println("while: $i")
        //prefix ++ will add first then return value
        //++i
        //suffix return first then add the value
        i++
    }

    i = 0
    do {
        println("do while: $i")
        ++i
    } while (i < 10)

    for (j: Char in "Kotlin") {
        println("range loop string: $j")
    }

    for (k: Int in 1..i) {
        println("range loop number: $k")
    }
}