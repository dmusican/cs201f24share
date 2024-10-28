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

fun makeTree(n: Int, height: Int) {
    // Make a node
    var tree = TreeNode(n)
    if (height > 0) {
        tree.leftChild = makeTree(n+1, height-1)
        tree.rightChild = makeTree(n+2, height-1)
    }
    return tree
}

fun main() {
    val root = TreeNode("allyb")
    root.leftChild = TreeNode("dean livingston")
    root.leftChild!!.leftChild =
        TreeNode("dean williams")
    root.rightChild = TreeNode("provost mattson")
    root.rightChild!!.leftChild =
        TreeNode("dave musicant")
    displayTree(root)
}
