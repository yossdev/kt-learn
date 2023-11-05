fun main() {
    /*
    Inferred Types
     */
    // mutable variable
    var num = 10
    // immutable variable
    val name = "Yosh"

    println(num)
    println(name)

    // change num variable
    num = 100
    println(num)

    // change name variable will cause compile error
    //name = "Yoss"
    //println(name) // Val cannot be reassigned

    /*
    Explicit Types
     */
    var min: Int = 1
    val addr: String = "Jl. Kotlin"
    println(min)
    println(addr)
}