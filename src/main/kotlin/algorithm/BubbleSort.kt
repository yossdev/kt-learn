package algorithm

fun bubbleSort(arr: Array<Int>): Array<Int> {
    var isSwap = false
    var i = 0
    if (arr.isEmpty() || arr.count() == 1) return arr
    while (true) {
        if (arr[i] > arr[i + 1]) {
            //swap value
            //arr[i] = arr[i+1].also { arr[i+1] = arr[i] }
            val swap = { a: Int, b: Int ->
                arr[i] = b
                arr[i + 1] = a
            }
            swap(arr[i], arr[i + 1])
            if (!isSwap) isSwap = true
        }
        if (i == arr.count()-2) {
            if (!isSwap) break
            i = 0
            isSwap = false
            continue
        }
        i++
    }
    return arr
}