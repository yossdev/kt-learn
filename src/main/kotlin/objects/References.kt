package objects

class House {
    var color = "White"
}

fun main() {
    val house = House()
    val houseRef = house
    println(house.color)
    houseRef.color = "Black"
    println("house color: ${house.color}")
    println("houseRef color: ${houseRef.color}")

    // Both house and houseRef have the same memory address
    println("house color: $house")
    println("houseRef color: $houseRef")

    /*
    NOTE:
    A var and val control references
    rather than objects.

    -> A var allows you to rebind a reference
       to a different object.
    -> A val prevents you from doing so.
     */
    // compile error cant reassign house
    //house = House()
    var house1 = House()
    println(house1)
    house1 = House()
    println(house1)
}