fun main() {
    greet("Hello Kotlin!")
    val res = sum(10,5)
    println(res)
    val mul = multiply(10,5)
    println(mul)
    val div = divide(10,5)
    println(div)
    val divByZero = divide(10,0)
    println(divByZero)
}

fun greet(str: String): Unit {
    println(str)
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

// single-line expression
fun multiply(a: Int, b: Int): Int = a * b

// single-line expression with inferred return type
fun divide(a: Int, b: Int) = if (b != 0) a / b else "can't divide by 0"