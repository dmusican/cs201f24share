// Comparable means your are allowed to do < >
class BSTSet<T: Comparable<T>> {
    data class Node<T>(var key :T
                       var left: Node<T>? = null,
                       var right: Node<T>? = null)

    var root: Node<T>? = null

    // insert: start at root
    // if value needs to go left, insert into left subtree
    // if value needs to ro right, insert into right subtree

    fun insert(item:T) {
        root = insert(item, root)
    }

    // (in class, I called subroot "subtree" but it confused
    // everyone everywhere so I changed it
    private fun insert(item: T, subroot: Node<T>?): Node<T> {
        if (subroot == null) {
            return Node<T>(item)
        }
        if (subroot.key == item) {
            throw RuntimeException("Item is already there.")
        }

        if (item < subroot.key) {
            subroot.left = insert(item, subroot.left)
        } else {
            // not equal, already checked
            subroot.right = insert(item, subroot.right)
        }
        return subroot
    }
}
