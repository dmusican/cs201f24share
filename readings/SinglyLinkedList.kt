// Kotlin version of linked list code from
// https://www.guru99.com/singly-linked-list.html
// Ported by Dave Musicant

class SinglyLinkedList<T> {

    private data class Node<T>(
        var value: T,
        var next: Node<T>?)

    private var head: Node<T>? = null

    fun traverse() {
        var current = head
        while (current != null) {
            print("" + current.value + " ")
            current = current.next
        }
        println()
    }

    fun search(target: T): Boolean {
        var current = head
        while (current != null) {
            if (current.value == target) {
                return true
            }
            current = current.next
        }
        return false
    }

    fun length(): Int {
        var length = 0
        var current = head
        while (current != null) {
            length++
            current = current.next
        }
        return length
    }

    fun insertAtBeginning(value: T) {
        val newNode = Node(value, null)
        newNode.next = head
        head = newNode
    }

    fun insertAtEnd(value: T) {
        val newNode = Node(value, null)

        // If the list is empty, make the new node the head
        if (head == null) {
            head = newNode
            return
        }

        var current = head
        // current cannot be null because just checked, and are checking through loop
        while (current!!.next != null) {
            current = current.next
        }
        current.next = newNode
    }

    fun insertAtPosition(position: Int, value: T) {
        if (position < 0) {
            throw Exception("Invalid position!")
        }

        else if (position == 0) {
            insertAtBeginning(value)
        }

        else {
            var current = head
            for (skips in 0..<position-1) {
                // current cannot be null because just checked head
                // first time, and then checked immediately afterwards
                println("skipping")
                current = current!!.next
                if (current == null) {
                    throw Exception("List not long enough!")
                }
            }
            // current cannot be null because just checked
            val temp = Node(value, current!!.next)
            current.next = temp
        }
    }

    fun removeFirstNode(): T {
        val tempHead = head
        if (tempHead == null) {
            throw Exception("List is empty!")
        } else {
            val firstValue = tempHead.value
            head = tempHead.next
            return firstValue
        }
    }

    fun removeLastNode(): T? {
        val headVal = head

        // If the list is empty, return null
        if (headVal == null) {
            return null;
        }

        // If the list has only one node, delete it and return the value
        if (headVal.next == null) {
            val removedValue = headVal.value
            head = null
            return removedValue
        }

        // Find the second last node
        var secondLast = headVal
        // Have already verified there are at least two nodes
        while (secondLast!!.next!!.next != null) {
            secondLast = secondLast.next
        }

        // Remove the last node
        val removedValue = secondLast.value
        secondLast.next = null
        return removedValue
    }


}


fun main() {
    val list = SinglyLinkedList<Int>()
    list.insertAtBeginning(1)
    list.insertAtBeginning(2)
    list.insertAtBeginning(3)
    println(list.search(1))
    println(list.search(2))
    println(list.search(3))
    println(list.search(4))
    list.traverse()
    println(list.length())
    list.insertAtEnd(8)
    list.traverse()
    list.insertAtPosition(0, 10)
    list.insertAtPosition(1, 11)
    list.insertAtPosition(2, 12)
    list.insertAtPosition(4, 13)
    list.insertAtPosition(8, 14)
    list.traverse()
    list.removeFirstNode()
    list.traverse()
    list.removeLastNode()
    list.traverse()
}
