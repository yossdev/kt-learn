package dataStructures

import testing.capture
import testing.eq

/*
A List is a container, which is an object
that holds other objects.
 */

fun main() {
    // This is Parameterized Types
    val ints: List<Int> = listOf(23, 123, 56)
    var result = 0
    for (i in ints) {
        result += i
    }
    result eq 202
    ints[2] eq 56

    // UnitTest exception type
    capture {
        ints[3]
    } contains
            listOf("ArrayIndexOutOfBoundsException")

    val cities: List<String> = listOf("Jakarta", "Bali", "Bandung")
    for (city: String in cities) {
        println(city)
    }

    // Generics Type
    val mix = listOf(1, "string", 1.0, false)
    for (dt in mix) {
        println(dt)
    }

    /*
    Read-Only and Mutable Lists
    All code above is using Read-Only List, because
    mutable list need have its own implementation.
     */
    // This is Mutable Lists
    // When initialize with empty list we need to explicitly
    // tell its type that the list hold
    val list = mutableListOf<Int>()
    println(list)

    // mutate the list
    list.add(1)
    println(list)
    list += 4
    println(list)
    list += listOf(9,10)
    println(list)
    list[1] = 11
    println(list)

    /*
    You cant treat Mutable List
    as Immutable List
     */
    val mutableListReturnAsImmutableList = getListFromMutableList()
    //mutableListReturnAsImmutableList += 4 // Compile Error

    // MultipleListRefs also called "aliasing"
    val mutableList = mutableListOf(1,2,3)

    // without explicit type List<Int> kotlin
    // will infer it as a reference to a mutable object
    //val listRefMutableList = mutableList
    //listRefMutableList += 5
    //
    // this will be read-only list
    // and observed changes in mutableList val
    val listRefMutableList: List<Int> = mutableList

    listRefMutableList eq listOf(1,2,3)

    mutableList += 4
    listRefMutableList eq listOf(1,2,3,4)
}

/*
The original object is still a MutableList, but
it is viewed through the lens of a List.
 */
fun getListFromMutableList(): List<Int> = mutableListOf(1, 2, 3)