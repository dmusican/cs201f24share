// Kotlin version of Heap code from
// https://www.programiz.com/dsa/heap-data-structure
// Ported by Dave Musicant

class Heap {
    fun heapify(hT: MutableList<Int>, i: Int) {
        var largest = i
        var l = 2 * i + 1
        var r = 2 * i + 2
        if (l < hT.count() && hT.get(l) > hT.get(largest))
            largest = l
        if (r < hT.count() && hT.get(r) > hT.get(largest))
            largest = r

        if (largest != i) {
            val temp = hT.get(largest)
            hT.set(largest, hT.get(i))
            hT.set(i, temp)

            heapify(hT, largest)
        }
    }

    fun insert(hT: MutableList<Int>, newNum: Int) {
        if (hT.count() == 0) {
            hT.add(newNum)
        } else {
            hT.add(newNum)
            for (i in (size/2-1) downTo 0) {
                heapify(hT, i)
            }
        }
    }

    fun deleteNode(hT: MutableList<Int>, num: Int) {
        val size = hT.count()
        var deleteIndex: Int = -1
        for (i in 0..<size) {
            if (num == hT.get(i)) {
                deleteIndex = i
                break
            }
        }

        var temp = hT.get(deleteIndex)
        hT.set(deleteIndex, hT.get(size-1))
        hT.set(size-1, temp)

        hT.remove(size-1)
        for (j in size/2-1 downTo 0)
            heapify(hT, j)
        }
    }
}

fun main() {

    val list = mutableListOf<Int>()

    val h = Heap()
    h.insert(list, 3)
    h.insert(list, 4)
    h.insert(list, 9)
    h.insert(list, 5)
    h.insert(list, 2)

    println("Max-Heap array: ")
    println(list)

    h.deleteNode(list, 4)
    println("After deleting an element: ")
    println(list)
}
