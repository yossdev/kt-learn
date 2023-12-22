package usability

import testing.eq

class Plane(var name: String)

fun main() {
   val plane = Plane("Air Force One")

   plane.countWord() eq 3
}

// Extension Function
/*
1. Extension start with a receiver type and followed by the function name
2. The class member function can be access with "this" keyword and can also be omitted
3. Only the public properties and member function can be access

NOTE:
This extension function can be very useful to extend
the functionality of a class that we don't have access to (source code wise)
like a closed source library.

I think this implementation is similar with go except extending a library struct
 */
fun Plane.countWord() = this.name.split(" ").count()