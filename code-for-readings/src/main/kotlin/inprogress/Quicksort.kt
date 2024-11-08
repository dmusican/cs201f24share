fun <T> swap(list: MutableList<T>, i: Int, j: Int) {
    val temp = list[i]
    list[i] = list[j]
    list[j] = temp
}


fun <T: Comparable<T>> quicksort(A: MutableList<T>, i: Int, j:Int) { // Quicksort
    val pivotindex = findpivot(i, j)  // Pick a pivot
    swap(A, pivotindex, j)               // Stick pivot at end
    // k will be the first position in the right subarray
    val k = partition(A, i, j-1, A[j])
    swap(A, k, j)                        // Put pivot in place
    if ((k-i) > 1) { quicksort(A, i, k-1) }  // Sort left partition
    if ((j-k) > 1) { quicksort(A, k+1, j) }  // Sort right partition
}

fun findpivot(i: Int, j: Int): Int {
    return (i+j)/2
}


fun <T: Comparable<T>> partition(A: MutableList<T>, leftStart: Int, rightStart: Int, pivot: T): Int {
    var left = leftStart
    var right = rightStart
    while (left <= right) { // Move bounds inward until they meet
        while (A[left] < pivot) { left++ }
        while ((right >= left) && (A[right] >= pivot) { right-- }
        if (right > left) { swap(A, left, right) } // Swap out-of-place values
    }
    return left            // Return first position in right partition
}

fun main() {
    var list = mutableListOf(10, 4, 2, 1, 20, 29, 3, 2, 6)
    quicksort(list, 0, list.count()-1)
    println(list)
}
