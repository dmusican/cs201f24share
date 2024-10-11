data class Node<T> (
    var item: T,
    var next: Node<T>?,
    var prev: Node<T>?)

class DoublyLinkedList<T> {
    private var head: Node<T>? = null
    private var tail: Node<T>? = null

    fun insertAtBeginning(item: T) {
        val newNode = Node(item, null, null)

        if (head == null) {
            head = newNode
            tail = newNode
        } else {
            head!!.prev = newNode
            newNode.next = head
            head = newNode
        }
    }

    fun printForward() {
        var current = head
        while (current != null) {
            print(current.item)
            current = current.next
        }
        println()
    }

    fun printBackward() {
        var current = tail
        while (current != null) {
            print(current.item)
            current = current.prev
        }
        println()
    }

    // Find target in the list; return position
    // (-1 if not there)
    fun search(target: T): Int {
        var index = 0
        var current = head
        while (current != null) {
            if (current.item == target) {
                return index
            }
            index++
            current = current.next
        }
        return -1
    }
}



fun main() {
    val mylist = DoublyLinkedList<Int>()
    mylist.insertAtBeginning(1)
    mylist.insertAtBeginning(2)
    mylist.insertAtBeginning(3)
    mylist.printForward()
    mylist.printBackward()
    println(mylist.search(1))
    println(mylist.search(2))
    println(mylist.search(3))
    println(mylist.search(4))

    val thing = Node(10, null, null)
    println(thing)
}
