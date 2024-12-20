fun <T> swap(list: MutableList<T>, i: Int, j: Int) {
    val temp = list[i]
    list[i] = list[j]
    list[j] = temp
}

fun <T: Comparable<T>> quicksort(list: MutableList<T>) {
    _quicksort(list, 0, list.count()-1)
}

fun <T: Comparable<T>> _quicksort(list: MutableList<T>, left: Int, right: Int) {
    if (left < right) {
        val pivot = list[left]
        var up = left+1
        var down = right

        while (up < down) {
            while (up < right && list[up] < pivot) {
                up++
            }

            while (down > left && list[down] > pivot) {
                down--
            }

            if (up < down) {
                swap(list,up,down)
            }
        }

        // Move pivot to the middle. down is now at the rightmost spot less
        // than or equal to pivot.
        swap(list,left,down)

        _quicksort(list, left, down-1)

        _quicksort(list, down+1, right)
    }
}
