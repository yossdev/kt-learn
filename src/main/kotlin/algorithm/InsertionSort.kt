package algorithm

fun insertionSort(arr: Array<Int>): Array<Int> {
    if (arr.isEmpty() || arr.count() == 1) return arr
    for (i in 1..<arr.count()) {
        var j = i
        while (j > 0 && arr[j-1] > arr[j]) {
            val swap = { a: Int, b: Int ->
                arr[j-1] = b
                arr[j] = a
            }
            swap(arr[j-1], arr[j])
            j--
        }
    }
    return arr
}