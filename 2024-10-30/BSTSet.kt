class BSTSet<T> {
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

    private fun insert(item: T, subtree: Node<T>?): Node<T> {
        if (subtree == null) {
            return Node<T>(item)
        }
        if (subtree.key == item) {
            throw RuntimeException("Item is already there.")
        }

        if (item < subtree.key) {
            subtree.left = insert(item, subtree.left)
        } else {
            // not equal, already checked
            subtree.right = insert(item, subtree.right)
        }
        return subtree
