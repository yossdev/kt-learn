package dataStructures

import testing.eq

/*
A Set is a collection that allows only
one element of each value
 */

fun main() {
    // Read-only set
    val set = setOf(1, 2, 2, 3)
    // Automatically remove duplicate
    set eq setOf(1, 2, 3)

    // Mutable set
    val mutableSet = mutableSetOf(1, 2, 3)
    mutableSet += 5
    // removing value that's not exist in set is fine
    mutableSet -= 4
    mutableSet -= setOf(1,2,3,5)
    println(mutableSet)
    mutableSet eq setOf<Int>()

    // Check membership using "contains()" or "in"
    println((2 in set))
    println(set.contains(2))

    // Element order are unimportant
    setOf(1, 2) eq setOf(2, 1)

    // Check if a set is containing another set
    set.containsAll(setOf(1, 2)) eq true

    // Set Union
    set.union(setOf(7, 9)) eq
            setOf(1, 2, 3, 7, 9)

    // Set intersection
    set intersect setOf(2, 3) eq
            setOf(2, 3)

    // Set difference
    // Can be expressed with either subtract() or the minus operator
    set subtract setOf(3) eq
            setOf(1, 2)
    set - setOf(3) eq
            setOf(1, 2)

    // Deduplication using set
    val list = listOf(11, 11, 22)
    // convert to set to remove duplication
    val dedupSet = list.toSet()
    dedupSet eq setOf(11, 22)
    // or use distinct() to remove duplication and return list
    val dedupList = list.distinct()
    dedupList eq listOf(11, 22)

    // get unique character from a string
    "hello".toSet() eq setOf('h', 'e', 'l', 'o')
}