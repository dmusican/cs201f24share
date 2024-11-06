// Mergesort code
// Ported to Kotlin by Dave Musicant from Java code at
// https://opendsa-server.cs.vt.edu/OpenDSA/Books/Everything/html/MergesortImpl.html

fun <T> mergesort(A: MutableList<Comparable<T>>, temp: MutableList<Comparable<T>>, left: Int, right: Int) {
  if (left == right) {        // List has one record
      return
  }
  val mid = (left+right)/2          // Select midpoint
  mergesort(A, temp, left, mid)     // Mergesort first half
  mergesort(A, temp, mid+1, right)  // Mergesort second half
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
