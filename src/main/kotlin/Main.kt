import algorithm.bubbleSort

// Unit type is the default return type in kotlin
fun main(args: Array<String>): Unit {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    val arr: Array<Int> = arrayOf(-2,1,2,-10)
    val res: Array<Int> = bubbleSort(arr)
    for (i in res) {
        println(i)
    }
}