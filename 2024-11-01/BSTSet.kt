class BSTSet<T: Comparable<T>> {
    data class Node<T>(var key: T,
                       var left: Node<T>? = null,
                       var right: Node<T>? = null)

    private var root: Node<T>? = null

    fun insert(item:T) {
        root = _insert(item, root)
    }

    private fun _insert(item: T, subroot: Node<T>?): Node<T> {
        if (subroot == null) {
            return Node<T>(item)
        }


    }
}

fun main() {
    val mytree = BSTSet<Int>()
    mytree.insert(5)
