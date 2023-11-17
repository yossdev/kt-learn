package varargs

import testing.eq

/*
The vararg keyword produces a flexibly-sized
argument list.
 */

/*
NOTE:
    Arrays and Lists look similar but implemented differently
    -> List is a regular library class, while
    -> Array has special low-level support.
Use Array only when third-party API requires an Array, or
when dealing with varargs.
 */
fun main() {
    sum(1,2,3) eq 6
    sum() eq 0

    // Array is always mutable
    val arr = intArrayOf(1,4,6,7)
    // use spread operator *var to pass as vararg not as a single array
    sum(*arr) eq 18
    // spread operator only works with Array
    val list = listOf(1,2,3)
    sum(*list.toIntArray()) eq 6

    // Declare vararg on the last of fun parameter
    multiplyBy(2, *arr) eq 36
}

/*
vararg produces Array and treat it
as if it were a List.

You can pass an Array wherever a vararg is accepted
 */
fun sum(vararg numbers: Int): Int {
    var total = 0
    for (num in numbers) {
        total += num
    }
    return total
}


// spread operator helpful
// when passing vararg to another
// function that require vararg
fun multiplyBy(multiplier: Int, vararg numbers: Int) = sum(*numbers) * multiplier