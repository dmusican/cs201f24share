// Mergesort code
// Ported to Kotlin by Dave Musicant from Java code at
// https://opendsa-server.cs.vt.edu/OpenDSA/Books/Everything/html/MergesortImpl.html

fun <T: Comparable<T>> mergesort(A: MutableList<T>) {
    _mergesort(A, A.toMutableList(), 0, A.count()-1)
}

fun <T: Comparable<T>> _mergesort(A: MutableList<T>, temp: MutableList<T>, left: Int, right: Int) {
    if (left == right) {        // List has one record
        return
    }
    val mid = (left+right)/2          // Select midpoint
    _mergesort(A, temp, left, mid)     // Mergesort first half
    _mergesort(A, temp, mid+1, right)  // Mergesort second half
    for (i in left..right) {    // Copy subarray to temp
        temp[i] = A[i]
    }
    // Do the merge operation back to A
    var i1 = left
    var i2 = mid + 1
    for (curr in left..right) {
        if (i1 == mid+1) {                 // Left sublist exhausted
            A[curr] = temp[i2++]
        }
        else if (i2 > right) {             // Right sublist exhausted
            A[curr] = temp[i1++]
        }
        else if (temp[i1] < temp[i2]) {     // Get smaller value
            A[curr] = temp[i1++]
        }
        else{
            A[curr] = temp[i2++]
        }
    }
}

fun main() {
    var list = mutableListOf(10, 4, 2, 1, 20, 29, 3, 2, 6)
    mergesort(list)
    println(list)
}
