package objects

/*
Available access modifier in Kotlin:
1. public
2. private
3. protected
4. internal

Default access modifier in kotlin is public
 */

class Computer(
    private var thread: Int
) {
    public fun cpuThread() = println("The cpu has $thread thread")
    fun initThread() {
        thread = 16
        cpuThread()
        startThread()
        disposeThread()
    }
    private fun startThread() = println("Ask the OS for Thread")
    private fun disposeThread() = println("Release thread")
}

/*
NOTE:
Just because a reference to an object is private inside a class
doesn't mean some other object can't have a public reference
to the same object.
 */
// MultipleRef
/*
Maintaining multiple references to a single object is called
aliasing and can produce surprising behavior
 */
class Plane(var state: String) {
    fun fly() {
        state = "Flying"
    }

    override fun toString(): String {
        return "Plane $state"
    }
}

class Hangar(plane: Plane) {
    private val aircraft = plane
    override fun toString(): String {
        return "Hangar $aircraft"
    }
}

/*
Modules:
    A module is a logically independent part of codebase.
    The way you divide a project into modules depend on the build system
    (such as Gradle or Maven).

Internal access modifier is accessible only inside the module
where it is defined. Use it when private to restrictive and
public is not what you want.
 */

fun main() {
    val pc = Computer(50)
    pc.initThread()
    // can't access private member
    //pc.startThread()

    val airForceOne = Plane("On Ground")
    // pass instance of Plane to hangar
    // it's pass by reference not by value
    val hangar = Hangar(airForceOne)
    println(hangar)
    airForceOne.fly()
    println(hangar)
    airForceOne.state = "Landing"
    println(hangar)

}