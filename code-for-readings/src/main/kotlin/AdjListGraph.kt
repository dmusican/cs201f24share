// Adjacency List graph representation
// Ported to Kotlin by Dave Musicant from Java code at
// https://www.programiz.com/dsa/graph-adjacency-list


// Add edge
fun addEdge(am: MutableList<MutableList<Int>>, s: Int, d: Int) {
    am[s].add(d)
    am[d].add(s)
}

// Print the graph
fun printGraph(am: MutableList<MutableList<Int>>) {
    for (i in 0..<am.count()) {
        println("\nVertex $i:")
        for (j in 0..<am[i].count()) {
            print(" -> ${am[i][j]}")
        }
        println()
    }
}

fun main() {

    // Create the graph
    val V = 5;
    val am = mutableListOf<MutableList<Int>>()

    for (i in 0..<V) {
        am.add(mutableListOf<Int>())
    }

    // Add edges
    addEdge(am, 0, 1)
    addEdge(am, 0, 2)
    addEdge(am, 0, 3)
    addEdge(am, 1, 2)

    printGraph(am)
}
