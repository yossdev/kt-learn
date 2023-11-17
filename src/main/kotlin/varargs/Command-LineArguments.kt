package varargs

// The type of command-line argument
// can only be Array<String>
/*
You can pass from the command-line using kotlinc compiler
https://kotlinlang.org/docs/command-line.html
# compile kotlin source to target jvm
$: kotlinc Command-LineArguments.kt -include-runtime -d Command-LineArguments.jar
# run the bytecode
$: java -jar Command-LineArguments.jar arg1 arg2

Or using Intellij IDEA by editing the corresponding "Run configuration"
Run > Edit Configurations.. > Program arguments
 */
fun main(args: Array<String>) {
    for (arg in args) {
        println(arg)
    }
}