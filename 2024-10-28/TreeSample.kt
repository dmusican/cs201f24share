// Binary Tree: tree where each node has a maximum of two children
data class TreeNode<T>(
    var data: T,
    var leftChild: TreeNode<T>? = null,
    var rightChild: TreeNode<T>? = null)

fun main() {
    val root = TreeNode("allyb")
    root.leftChild = TreeNode("dean livingston")
    root.rightChild = TreeNode("provost mattson")
    root!!.leftChild!!.leftChild = TreeNode("dave musicant")
