data class Node<T> (
    var item: T,
    var next: Node<T>?,
    var prev: Node<T>?)

class DoublyLinkedList<T> {
    private var head: Node<T>? = null
    private var tail: Node<T>? = null
