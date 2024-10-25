// Tree traversal in Kotlin
// Ported to Kotlin by Dave Musicant from Java code at
// https://www.programiz.com/dsa/tree-traversal
// https://www.programiz.com/dsa/binary-tree
// (These two programs do the same thing, they're just
// written by different people with slightly different styles.
// I chose a little of each.)

data class Node(var item: Int,
                var left: Node? = null,
                var right: Node? = null)

class BinaryTree {

    // Root of Binary Tree
    var root: Node? = null

    fun postorder(node: Node?) {
        if (node != null) {
            postorder(node.left)
            postorder(node.right)
            print("${node.item}->")
        }
    }

    fun inorder(node: Node?) {
        if (node != null) {
            inorder(node.left)
            print("${node.item}->")
            inorder(node.right)
        }
    }

    fun preorder(node: Node?) {
        if (node != null) {
            print("${node.item}->")
            preorder(node.left)
            preorder(node.right)
        }
    }
}

fun main() {
    val tree = BinaryTree()
    tree.root = Node(1)
    tree.root!!.left = Node(12)
    tree.root!!.right = Node(9)
    tree.root!!.left!!.left = Node(5)
    tree.root!!.left!!.right = Node(6)

    println("Inorder traversal")
    tree.inorder(tree.root)

    println()
    println("Preorder traversal ")
    tree.preorder(tree.root)

    println()
    println("Postorder traversal")
    tree.postorder(tree.root)
}
