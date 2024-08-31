// Kotlin version of linked list code from
// https://www.geeksforgeeks.org/singly-linked-list-tutorial/
// and
// https://www.guru99.com/doubly-linked-list.html
// as a starting point, but I also added in a tail pointer
// because it makes things more efficient
// Ported by Dave Musicant

class DoublyLinkedList<T> {

    private data class Node<T>(
        var item: T,
        var next: Node<T>?,
        var prev: Node<T>?)

    private var head: Node<T>? = null
    private var tail: Node<T>? = null

    override fun toString(): String {
        var result = ""
        var current = head
        while (current != null) {
            result = result + current.item + " "
            current = current.next
        }
        return result.trim()
    }

    fun toStringBackwards(): String {
        var result = ""
        var current = tail
        while (current != null) {
            result = result + current.item + " "
            current = current.prev
        }
        return result.trim()
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
        val newNode = Node(item, head, null)

        val first = head
        if (first != null) {
            first.prev = newNode
        }

        if (tail == null) {
            tail = newNode
        }
        head = newNode
    }

    fun insertAtEnd(item: T) {
        val newNode = Node(item, null, tail)

        val last = tail
        if (last != null) {
            last.next = newNode
        }

        if (head == null) {
            head = newNode
        }
        tail = newNode
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
                current = current!!.next
                if (current == null) {
                    throw Exception("List not long enough!")
                }
            }

            val newNode = Node(item, current!!.next, current)
            current.next = newNode
            if (newNode.next != null) {
                newNode.next!!.prev = newNode
            } else {
                tail = newNode
            }
        }
    }

    fun removeFirstNode() {
        if (head == null) {
            throw Exception("List is empty!")
        } else if (head == tail) {
            head = null
            tail = null
        } else {
            head = head!!.next
            head!!.prev = null
        }
    }

    fun removeLastNode() {
        if (tail == null) {
            throw Exception("List is empty!")
        } else if (head == tail) {
            head = null
            tail = null
        } else {
            tail= tail!!.prev
            tail!!.next = null
        }
    }

    fun deleteAtPosition(position: Int) {
        var current = head

        // If the list is empty or the position is invalid
        if (current == null || position < 0) {
            throw Exception("Invalid position!")
        }

        // If the first node needs to be deleted, special case
        // because head needs to be moved
        if (position == 0) {
            val nextNode = current.next
            head = nextNode
            if (nextNode != null) {
                nextNode.prev = null
            } else {
                tail = null
            }
            return
        }

        // Traverse to the node to be deleted
        for (skips in 0..<position) {
            if (current == null) {
                throw Exception("List not long enough!")
            }
            current = current.next
        }

        // Verify position was not too large
        if (current == null) {
            throw Exception("List not long enough!")
        }

        // Last node to be deleted is a special case, since
        // tail needs to be moved. We know there are at least two
        // nodes, because if only one node, would have been handled above
        if (current.next == null) {
            tail = current.prev
            tail!!.next = null
        } else {
            current.next!!.prev = current.prev
            current.prev!!.next = current.next
        }
    }
}


fun main() {
    val list = DoublyLinkedList<Int>()
    list.insertAtBeginning(1)
    list.insertAtBeginning(2)
    list.insertAtBeginning(3)
    println(list.search(1))
    println(list.search(2))
    println(list.search(3))
    println(list.search(4))
    println(list)
    println(list.length())
    list.insertAtEnd(8)
    println(list)
    list.insertAtPosition(0, 10)
    list.insertAtPosition(1, 11)
    list.insertAtPosition(2, 12)
    list.insertAtPosition(4, 13)
    list.insertAtPosition(8, 14)
    println(list)
    list.removeFirstNode()
    println(list)
    list.removeLastNode()
    println(list)
    list.deleteAtPosition(0)
    println(list)
    list.deleteAtPosition(4)
    println(list)
    list.deleteAtPosition(4)
    println(list)
}
