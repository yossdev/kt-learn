// use package keyword to define a package
// kotlin convention is lowercase
/*
Kotlin let you name your package to anything,
but it's considered good style to name it identical
to the directory it's in (same like golang).
 */
package objects

import kotlin.math.PI
import kotlin.math.cos as cosine
// use asterisk to import all
import kotlin.math.*

/*
Definition:
    A package is an associated collection of code.
    Often contains multiple functions and classes
 */

fun main() {
    // we imported PI constant from kotlin.math package
    println(PI)
    // import cosine from kotlin.math.cos and aliasing it with cosine
    // this use for better naming or conflict naming
    println(cosine(0.0))
}