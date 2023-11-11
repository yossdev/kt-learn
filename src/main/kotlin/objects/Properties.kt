package objects

class Bowl {
    // This is properties
    val maxBowlCap = 100
//    var currentBowlCap = 0
    private var currentBowlCap = 0

    fun add(cap: Int) {
        currentBowlCap += cap

        if (currentBowlCap > maxBowlCap) currentBowlCap=maxBowlCap
    }

    fun get() = currentBowlCap

}

fun main() {
    val bowl: Bowl = Bowl()
//    println(bowl.currentBowlCap)
//    bowl.currentBowlCap=200
//    println(bowl.currentBowlCap)
    bowl.add(200)
    println(bowl.get())
}