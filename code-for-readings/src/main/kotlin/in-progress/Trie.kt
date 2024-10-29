data class TrieNode(
    var children: Array<TrieNode?> = Array<TrieNode?>(26) { null },

    // This will keep track of number of strings that
    // are stored in the Trie from root node to any Trie
    // node.
    var wordCount: Int = 0
)

fun main() {
    println(TrieNode())
}
