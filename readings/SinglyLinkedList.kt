// Kotlin version of linked list code from
// https://www.guru99.com/singly-linked-list.html
// Ported by Dave Musicant

class SinglyLinkedList<T> {

    private data class Node<T>(
        var data: T,
        var next: Node<T>?)

    private var head: Node<T>? = null

    fun traverse() {
        var current = head
        while (current != null) {
            print("" + current.data + " ")
            current = current.next
        }
        println()
    }

    fun search(target: T): Boolean {
        var current = head
        while (current != null) {
            if (current.data == target) {
                return true
            }
            current = current.next
        }
        return false
    }

    fun insertAtBeginning(value: T) {
        val newNode = Node(value, null)
        newNode.next = head
        head = newNode
    }

    // fun insertAtEnd(value: T) {
    //     val newNode = Node(value, null)
    //     if (head == null) {
    //         head = newNode
    //     } else {
    //         var temp = head
    //         while (temp!!.next != null) {
    //             temp = temp.next
    //         }
    //         temp.next = newNode
    //     }
    // }

    // fun searchAndDelete(searchItem: T) {
    //     var head2 = head  // local copy to make Kotlin happy
    //     if (head2 == null) {
    //         throw Exception("List is empty.")
    //     } else if (head2.data == searchItem) {
    //         head2 = head2.next
    //     } else {
    //         var current = head2
    //         while (current.next != null) {
    //             if (current.next.data == searchItem) {
    //                 current.next = current.next.next
    //             }


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
}
