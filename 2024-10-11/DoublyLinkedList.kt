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
}

fun main() {
    val mylist = DoublyLinkedList<Int>()
    mylist.insertAtBeginning(1)
    mylist.insertAtBeginning(2)
    mylist.insertAtBeginning(3)
}
