fun main() {
    var input: String? = null
    println(input)

    // Null-safety
    // doing it like will cause compile error
    // println(input.uppercase())

    // access with ? will return the value or null
     println(input?.uppercase())

    // access with !! will tell the program that it will not null
    // this will cause runtime error
    //println(input!!.uppercase())

    // assign default value to nullable var
    var input2: String = input ?: ""
    println(input2.uppercase())

    input = "hello"
    println(input)

    // safe to call uppercase since it's not null anymore
    println(input.uppercase())
}