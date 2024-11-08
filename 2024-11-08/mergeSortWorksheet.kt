// Kick it all off
fun <T: Comparable<T>> mergesort(list: MutableList<T>) {

    // copies list; just a brief way to make a list of the right size,
    // don't care about contents
    val tempList = list.toMutableList()

    mergesort(list, tempList, 0, list.count()-1)
}

// Recursive function that outlines the procedure
fun <T: Comparable<T>> mergesort(list: MutableList<T>,
                                 tempList: MutableList<T>,
                                 left: Int, right: Int) {
    if (left < right) {
        val center = (left + right) / 2
        mergesort(list, tempList, left, center)
        mergesort(list, tempList, center+1, right)
        merge(list, tempList, left, center+1, right)
    }
}


// Workhorse: Merge together two sorted runs of integers: one starting
// at leftStart, and ending at rightStart-1; the second starting at
// rightStart, and ending at rightEnd
fun <T: Comparable<T>> merge(list: MutableList<T>,
                             tempList: MutableList<T>,
                             leftStart: Int,
                             rightStart: Int,
                             rightEnd: Int) {
    val leftEnd = rightStart - 1
    var cur = 0    // Current location in tempList
    var left = leftStart
    var right = rightStart

    // Start merging until one of the halves is exhausted
    while (left <= leftEnd && right <= rightEnd) {
        if (list[left] <= list[right]) {

            tempList[cur] = __________________________________

            left = _____________________________________
        } else {

            tempList[cur] = _________________________________

            right = __________________________________________
        }

        cur = ________________________________________________
    }

    // If above loop exits, either left half or right half is
    // done. Finish copying other half that's not done.

    // Copy rest of first half

    while (_______________________________________) {

        tempList[cur] = ___________________________________
        cur = cur + 1
        left = left + 1
    }

    // Copy rest of second half
    while (_______________________________________________) {

        tempList[cur] = ______________________________________
        cur = cur + 1
        right = right + 1
    }

    // Copy temp list over original

    for (i in 0..< _________________________________________)

        __________________________________ = tempList[i]
}
