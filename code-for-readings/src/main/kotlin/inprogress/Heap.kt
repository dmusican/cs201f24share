// Kotlin version of Heap code from
// https://www.programiz.com/dsa/heap-data-structure
// Ported by Dave Musicant

class Heap {
    fun heapify(hT: MutableList<Int>, i: Int) {
        int size = hT.size()
        int largest = i
        int l = 2 * i + 1
        int r = 2 * i + 2
        if (l < size && hT.get(l) > hT.get(largest))
            largest = l
        if (r < size && hT.get(r) > hT.get(largest))
            largest = r

        if (largest != i) {
            int temp = hT.get(largest)
            hT.set(largest, hT.get(i))
            hT.set(i, temp)

            heapify(hT, largest)
        }
    }

    void insert(ArrayList<Integer> hT, int newNum) {
        int size = hT.size()
        if (size == 0) {
            hT.add(newNum)
        } else {
            hT.add(newNum)
            for (int i = size / 2 - 1 i >= 0 i--) {
                heapify(hT, i)
            }
        }
    }

    void deleteNode(ArrayList<Integer> hT, int num)
    {
        int size = hT.size()
        int i
        for (i = 0 i < size i++)
        {
            if (num == hT.get(i))
                break
        }

        int temp = hT.get(i)
        hT.set(i, hT.get(size-1))
        hT.set(size-1, temp)

        hT.remove(size-1)
        for (int j = size / 2 - 1 j >= 0 j--)
        {
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
