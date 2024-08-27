// Kotlin version of linked list code from
// https://www.geeksforgeeks.org/singly-linked-list-tutorial/
// Ported by Dave Musicant

class SinglyLinkedList<T> {

    private data class Node<T>(
        var item: T,
        var next: Node<T>?)

    private var head: Node<T>? = null

    fun traverse() {
        var current = head
        while (current != null) {
            print("" + current.item + " ")
            current = current.next
        }
        println()
    }

    fun search(target: T): Boolean {
        var current = head
        while (current != null) {
            if (current.item == target) {
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

    fun insertAtBeginning(item: T) {
        val newNode = Node(item, null)
        newNode.next = head
        head = newNode
    }

    fun insertAtEnd(item: T) {
        val newNode = Node(item, null)

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

    fun insertAtPosition(position: Int, item: T) {
        if (position < 0) {
            throw Exception("Invalid position!")
        }

        else if (position == 0) {
            insertAtBeginning(item)
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
            val temp = Node(item, current!!.next)
            current.next = temp
        }
    }

    fun removeFirstNode() {
        val headVal = head
        if (headVal == null) {
            throw Exception("List is empty!")
        } else {
            head = headVal.next
        }
    }

    fun removeLastNode() {
        val headVal = head

        // If the list is empty, do nothing
        if (headVal == null) {
            return
        }

        // If the list has only one node, delete it
        if (headVal.next == null) {
            head = null
            return
        }

        // Find the second last node
        var secondLast = headVal
        // Have already verified there are at least two nodes
        while (secondLast!!.next!!.next != null) {
            secondLast = secondLast.next
        }

        // Remove the last node
        secondLast.next = null
    }


    fun deleteAtPosition(position: Int) {
        val headCopy = head

        // If the list is empty or the position is invalid
        if (headCopy == null || position < 0) {
            throw Exception("Invalid position!")
        }

        // If the head needs to be deleted
        if (position == 0) {
            head = headCopy.next
        }

        // Traverse to the node before the position to be deleted
        var current = headCopy
        for (skips in 0..<position-1) {
            // current cannot be null because just checked head
            // first time, and then checked immediately afterwards
            current = current!!.next
            if (current == null) {
                throw Exception("List not long enough!")
            }
        }

        // Verify position was not too large
        if (current!!.next == null) {
            throw Exception("List not long enough!")
        }

        current.next = current.next!!.next
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
    list.deleteAtPosition(0)
    list.traverse()
    list.deleteAtPosition(4)
    list.traverse()
    list.deleteAtPosition(4)
    list.traverse()
}
