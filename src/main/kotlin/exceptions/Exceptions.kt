package exceptions

import testing.capture
import testing.eq

/*
Error Handling.
Basics of exceptions as an error-reporting mechanism
 */

fun main() {
    erroneousCode()

    // This will capture the exception
    capture {
        "b".toInt()
    } eq "NumberFormatException: " +
            """For input string: "b"""

    "1$".toIntOrNull() eq null

    // will throw default exception
    //average(100,0)

    // will throw custom exception
    //average2(100,0)

    capture {
        average2(100,0)
    } eq "IllegalArgumentException: " +
            "n can't be zero"
}

fun erroneousCode() {
    // Uncomment this line to get an exception
    //val i = "a".toInt()
}

fun average(sum: Int, n: Int) = sum / n

fun average2(sum: Int, n: Int) =
    if (n == 0)
        throw  IllegalArgumentException("n can't be zero")
    else
        sum/n