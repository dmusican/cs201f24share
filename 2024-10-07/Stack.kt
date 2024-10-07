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
