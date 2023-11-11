package objects

/*
You initialize a new object by passing
information to a constructor.

Definition:
    A constructor is like a special member function that
    initialize a new object.
 */

// This is the simplest form of a constructor
// single-line class constructor
class Car

// Inaccessible class parameter constructor
class Alien(name: String) {
    val greeting = "I'm $name"
}

// Accessible class parameter constructor
/*
Constructor param became property when declare with:
1. var - mutable
2. val - immutable
and is thus accessible outside the constructor.
 */
class MutableNameAlien(var name: String)
class ImmutableNameAlien(val name: String)

class GroundVehicle(
    val name: String,
    val wheels: Int,
    val color: String,
    val engine: String
) {
    fun describe(): String {
        return """
            Name: $name
            wheels: $wheels
            color: $color
            engine: $engine
        """.trimIndent()
    }
}

class Scientist(val name: String) {
    // polymorphism
    // implementing our own toString build-in member function
    override fun toString(): String {
        return "Scientist('$name')"
    }
}

fun main() {
    val mazda = Car()
    // By default, this will called toString() member function
    // which return the className@HexadecimalAddress
    println(mazda)

    val mrMeeseek = Alien("Mr. Meeseek")
    println(mrMeeseek.greeting)

    val mrPoopieButthole = MutableNameAlien("Mr. PoopieButthole")
    mrPoopieButthole.name = "ouuuuieee Mr. Poopiehole"
    val squancy = ImmutableNameAlien("Squancy")
    // can't do this
    //squancy.name = "squancy squancy"
    println(mrPoopieButthole.name)
    println(squancy.name)

    val mustang = GroundVehicle(
        name = "Mustang",
        wheels = 4,
        color = "Red",
        engine = "V8"
    )
    println(mustang.describe())

    val rick = Scientist("Pickle Rick!")
    // This will print Scientist('Pickle Rick!)
    // because we override the build-in toString
    // member function.
    println(rick)
}