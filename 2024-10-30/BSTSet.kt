class BSTSet<T> {
    data class Node<T>(var key :T
                       var left: Node<T>? = null,
                       var right: Node<T>? = null)
