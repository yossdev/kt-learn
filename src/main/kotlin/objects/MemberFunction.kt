package objects

class Player {
    // This is member function (method)
    // Member function belongs to a class
    fun walk(): String {
        return "player are walking"
    }
    fun walkRun(): String {
        return walk() + " but faster"
    }
}

// Top-level functions exist by themselves and are
// not part of a class.
fun myFunc() {
    println("print from Top-level function")
}
fun main() {
    val p1 = Player()
    println( p1.walk())
    println(p1.walkRun())
}