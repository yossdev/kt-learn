package testing

fun main() {
    val v1 = 11
    val v2 = "Golang"

    v1 eq 11
    v2 eq "Golang"

    v2 neq "Zig"

    v2 eq "Zig"
}