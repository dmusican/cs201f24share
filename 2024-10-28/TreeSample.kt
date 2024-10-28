// Binary Tree: tree where each node has a maximum of two children
data class TreeNode<T>(
    var data: T,
    var leftChild: TreeNode<T>? = null,
    var rightChild: TreeNode<T>? = null)

fun <T> displayTree(current: TreeNode<T>?,
                    prefix: String = "") {
    if (current == null) {
        return
    }

    displayTree(current.rightChild, prefix + " ")
    println(prefix + current.data)
    displayTree(current.leftChild, prefix + " ")
}

fun <T> countNodes(current: TreeNode<T>?): Int {
    if (current == null) {
        return 0
    } else {
        return 1 + countNodes(current.leftChild)
            + countNodes(current.rightChild)
    }
}



fun makeTree(n: Int, height: Int): TreeNode<Int> {
    // Make a node
    var tree = TreeNode(n)
    if (height > 0) {
        tree.leftChild = makeTree(n+1, height-1)
        tree.rightChild = makeTree(n+2, height-1)
    }
    return tree
}

fun main() {
    var mytree = makeTree(1, 3)
    displayTree(mytree)
    // val root = TreeNode("allyb")
    // root.leftChild = TreeNode("dean livingston")
    // root.leftChild!!.leftChild =
    //     TreeNode("dean williams")
    // root.rightChild = TreeNode("provost mattson")
    // root.rightChild!!.leftChild =
    //     TreeNode("dave musicant")
    // displayTree(root)
}
