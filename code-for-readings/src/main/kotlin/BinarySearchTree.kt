// Binary Search Tree operations
// Tree traversal in Kotlin
// Ported to Kotlin by Dave Musicant from Java code at
// https://www.programiz.com/dsa/binary-search-tree

class BinarySearchTree {

    data class Node(var key: Int,
                    var left: Node? = null,
                    var right: Node? = null)

    var root: Node? = null

    fun insert(key: Int) {
        root = insertKey(root, key)
    }

    // Insert key in the tree
    private fun insertKey(root: Node?, key: Int): Node? {
        // Return a new node if the tree is empty
        if (root == null) {
            return Node(key)
        }

        // Traverse to the right place and insert the node
        if (key < root.key) {
            root.left = insertKey(root.left, key)
        } else if (key > root.key) {
            root.right = insertKey(root.right, key)
        }

        return root
    }

    fun inorder() {
        inorderRec(root)
    }

    // Inorder Traversal
    fun inorderRec(root: Node?) {
        if (root != null) {
            inorderRec(root.left)
            print("${root.key} -> ")
            inorderRec(root.right)
        }
    }

    fun deleteKey(key: Int) {
        root = deleteRec(root, key)
    }

    fun deleteRec(root: Node?, key: Int): Node? {
        // Return if the tree is empty
        if (root == null)
            return root

        // Find the node to be deleted
        if (key < root.key) {
            root.left = deleteRec(root.left, key)
        } else if (key > root.key) {
            root.right = deleteRec(root.right, key)
        } else {
            // If the node is with only one child or no child
            if (root.left == null)
                return root.right
            else if (root.right == null)
                return root.left

            // If the node has two children
            // Place the inorder successor in position of the node to be deleted
            root.key = minValue(root.right!!)

            // Delete the inorder successor
            root.right = deleteRec(root.right, root.key)
        }

        return root
    }

    // Find the inorder successor
    fun minValue(root: Node): Int {
        var current = root
        var minv = current.key
        while (current.left != null) {
            minv = current.left!!.key
            current = current.left!!
        }
        return minv
    }
}

// Driver Program to test above functions
fun main() {
    val tree = BinarySearchTree()

    tree.insert(8)
    tree.insert(3)
    tree.insert(1)
    tree.insert(6)
    tree.insert(7)
    tree.insert(10)
    tree.insert(14)
    tree.insert(4)

    print("Inorder traversal: ")
    tree.inorder()

    println("\n\nAfter deleting 10")
    tree.deleteKey(10)
    print("Inorder traversal: ")
    tree.inorder()
}
