package dataStructures

import testing.capture
import testing.eq

/*
A Map connects keys to values and looks up a value when given a key

mapOf() and mutableMapOf() preserve the order in which
the element are put into the Map. This is not guaranteed for
other types of Map.

Map look like simple little databases. They are sometimes
called associative arrays, because they associate keys
with values.
 */

fun main() {
    // Empty map by giving the type
    // Read-only
    val mathConstants: Map<String, Double> = mapOf()
    println(mathConstants)

    // Mutable
    val mutableMathConstants: MutableMap<String, Double> = mutableMapOf()
    mutableMathConstants += "Pi" to 3.141
    mutableMathConstants += "e" to 2.218
    mutableMathConstants += "phi" to 1.618
    mutableMathConstants eq "{Pi=3.141, e=2.218, phi=1.618}"
    // If the key is not exist it will add it
    // else it will change existing value
    mutableMathConstants["Pi"] = 2.0
    mutableMathConstants eq "{Pi=2.0, e=2.218, phi=1.618}"
    mutableMathConstants["Pi"] = 3.141

    // Lookup value from map
    mutableMathConstants["Pi"] eq 3.141

    // Iterate through key-vale pairs
    var keyValue = ""
    for (entry in mutableMathConstants) {
        keyValue += "${entry.key}=${entry.value}, "
    }
    keyValue eq "Pi=3.141, e=2.218, phi=1.618,"

    // Unpack during iteration
    keyValue = ""
    for ((key, value) in mutableMathConstants) {
        keyValue += "${key}=${value}, "
    }
    keyValue eq "Pi=3.141, e=2.218, phi=1.618,"

    // The only way to "add" an element
    // to a read-only Map is by  creating a new Map.
    val readOnlyMap = mapOf(1 to "one", 2 to "two")
    val copyReadOnlyMap = readOnlyMap + (3 to "three")
    copyReadOnlyMap eq mapOf(1 to "one", 2 to "two", 3 to "three")

    /*
    A map will return null if it doesn't contain an entry
    for a given key.

    If you need a result that can't be null, use getValue() and catch
    NoSuchElementException if the key is missing.
     */
    val map = mapOf('a' to "attempt")
    map['b'] eq null
    capture {
        map.getValue('b')
    } eq "NoSuchElementException: " +
            "Key b is missing in the map."
    // Use getOrDefault() as alternative to null or an exception
    map.getOrDefault('b', "Not Exist") eq "Not Exist"

    /*
    You can store class instances as values in a Map.

    NOTE:
        It's possible to use class instances as keys in a Map,
        but that's trickier.
     */
    val rick = Contact("rick", "1234567890")
    val morty = Contact("morty", "1234567890".reversed())
    val contacts = mapOf(
        rick.phone to rick,
        morty.phone to morty
    )
    println(contacts)
    contacts["1234567890"] eq rick
}

class Contact(
    val name: String,
    val phone: String
) {
    override fun toString(): String {
        return "Contact('$name', '$phone')"
    }
}