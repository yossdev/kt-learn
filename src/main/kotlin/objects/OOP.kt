package objects

class OOP

// Introduction
/*
Objects store data using properties (vals and vars) and perform
operation with this data using functions.

Some definitions:
- Class:
    Define properties and functions for what is essentially a new
    data type. Classes are also called user-defined types.
- Member:
    Either a property or a function of a class.
- Member function (method):
    A function that works only with a specific class of object.
- Creating an object:
    Making a val or var of a class. Also called creating an instance of that class.
 */

fun main() {
    // creating an instance of kotlin built-in class
    val range: IntRange = IntRange(1, 10)
    println(range)
    // calling member function (method)
    println(range.sum())
    // creating an instance of user-defined class
    // in kotlin no need to use the new keyword
    val oop: OOP = OOP()
    println(oop)
}