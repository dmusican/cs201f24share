data class TrieNode(
    var childNode: Array<TrieNode?> = Array<TrieNode?>(26) { null },

    // This will keep track of number of strings that
    // are stored in the Trie from root node to any Trie
    // node.
    var wordCount: Int = 0
)

fun insert(root: TrieNode, key: String) {
    // Initialize the currentNode pointer with the root node
    var currentNode = root

    // Note that letter is a 'Char' type
    for (letter in key) {
        val index = letter - 'a'

        // Check if the node exist for the current character in the Trie.
        if (currentNode.childNode[index] == null) {

            // Keep the reference for the newly created node.
            currentNode.childNode[index] = TrieNode()
        }

        // Now, move the current node pointer to the newly created node.
        currentNode = currentNode.childNode[index]!!
    }

    // Increment the wordEndCount for the last currentNode pointer this implies
    // that there is a string ending at currentNode.
    currentNode.wordCount++
}

fun isPrefixExist(root: TrieNode, key: String): Boolean {
    // Initialize the currentNode pointer with the root node
    var currentNode = root

    // Iterate across the length of the string
    for (c in key) {

        // Check if the node exists for the current character in the Trie.
        if (currentNode.childNode[c - 'a'] == null) {

            // Given word as a prefix does not exist in Trie
            return false
        }

        // Move the currentNode pointer to the already
        // existing node for current character.
        currentNode = currentNode.childNode[c - 'a']!!
    }

      // Prefix exists in the Trie
    return true
}

// Returns true if key present in trie, else false
fun search(root: TrieNode, key: String): Boolean {
    // Initialize the currentNode
    // with the root node
    var currentNode = root

    for (letter in key) {
        val index = letter - 'a'

        // Check if the node exist for the current character in the Trie.
        if (currentNode.childNode[index] == null) {
            return false
        }

        // Move the currentNode to the already existing node for current
        // character.
        currentNode = currentNode.childNode[index]!!
    }

    return (currentNode.wordCount > 0)
}



fun main() {
    println(TrieNode())
}
