interface Stack<T> {
    fun push(item: T)
    fun pop(): T
    fun peek(): T
    fun isEmpty(): Boolean

}

class LinkedStack<T> : Stack<T> {
    private data class Node<T>(
        var item: T,
        var next: Node<T>?
    )

    private var head: Node<T>? = null

    override fun isEmpty(): Boolean {
        return head==null
    }

    override fun peek(): T {
        if (head == null) {
            throw RuntimeException("empty stack!")
        } else {
            return head!!.item
        }
    }

    override fun push(newItem: T) {
        val newNode = Node(newItem, head)
        head = newNode
    }


    // Could have also fixed with !!
    override fun pop(): T {
        val myHead = head
        if (myHead == null) {
            throw RuntimeException("empty stack!")
        } else {
            val currentValue = myHead.item
            head = myHead.next
            return currentValue
        }
    }


    }











    
}
