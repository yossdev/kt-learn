// Definition
/*
A statement changes state (not produce result)
An expression expresses (always produce result)
 */

// NOTE: Almost everything in Kotlin is an Expression
/*
In each case, everything to the right of the
right side of the = (equal sign) is an expression,
which produces a result that is assigned to the identifier
on the left
 */

fun main() {
    val result = println("this println also return a value called unit, which i think same as void return type")
    println(result)
}