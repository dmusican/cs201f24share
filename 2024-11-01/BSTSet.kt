class BSTSet<T: Comparable<T>> {
    data class Node<T>(var key: T,
                       var left: Node<T>? = null,
                       var right: Node<T>? = null)

    private var root: Node<T>? = null

    fun insert(item:T) {
        insert(T, root)
    }

    fun insert(item: T, subroot: Node<T>?) {

    }
}

fun main() {
    val mytree = BSTSet<Int>()
    mytree.insert(5)
