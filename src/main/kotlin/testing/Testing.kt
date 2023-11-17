package testing

/*
Testing framework use here is from
Atomic Kotlin implementation.
It's not production testing framework.
Here's a list of testing system for production application:
1. JUnit is one of the most popular Java test framework, and
    easily used from withing Kotlin.
2. Kotest is designed specifically for Kotlin, and take
    advantage of Kotlin language features.
3. The Spek Framework produces a different form of testing,
    called Specification Testing.
 */

fun main() {
    val v1 = 11
    val v2 = "Golang"

    v1 eq 11
    v2 eq "Golang"

    v2 neq "Zig"

    v2 eq "Zig"

    trace("info")
}