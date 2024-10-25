// Tree traversal in Kotlin
// Ported to Kotlin by Dave Musicant from Java code at
// https://www.programiz.com/dsa/tree-traversal

data class Node(var item: Int,
                var left: Node? = null,
                var right: Node? = null)

class BinaryTree {

    // Root of Binary Tree
    var root: Node? = null

    fun postorder(node: Node?) {
        if (node == null)
            return

        // Traverse left
        postorder(node.left)
        // Traverse right
        postorder(node.right)
        // Traverse root
        print("${node.item}->")
    }

    fun inorder(node: Node?) {
        if (node == null)
            return

        // Traverse left
        inorder(node.left)
        // Traverse root
        print("${node.item}->")
        // Traverse right
        inorder(node.right)
    }

    fun preorder(node: Node?) {
        if (node == null)
            return

        // Traverse root
        print("${node.item}->")
        // Traverse left
        preorder(node.left)
        // Traverse right
        preorder(node.right)
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
