// Adjacency Matrix graph representation
// Ported to Kotlin by Dave Musicant from Java code at
// https://www.programiz.com/dsa/graph-adjacency-matrix

class AdjMatrixGraph(numVertices: Int) {
    var adjMatrix = Array<Array<Boolean>>(numVertices) {Array<Boolean>(numVertices) {false}}

    // Add edges
    fun addEdge(i: Int, j: Int) {
        adjMatrix[i][j] = true
        adjMatrix[j][i] = true
    }

    // Remove edges
    fun removeEdge(i: Int, j: Int) {
        adjMatrix[i][j] = false
        adjMatrix[j][i] = false
    }

    // Print the matrix
    override fun toString(): String {
        var s = StringBuilder()
        for (i in 0..<adjMatrix.count()) {
            s.append("$i: ")
            for (j in adjMatrix[i]) {
                s.append((if (j) 1 else 0).toString() + " ")
            }
            s.append("\n")
        }
        return s.toString()
    }
}

fun main() {
    val g = AdjMatrixGraph(4)

    g.addEdge(0, 1)
    g.addEdge(0, 2)
    g.addEdge(1, 2)
    g.addEdge(2, 0)
    g.addEdge(2, 3)

    print(g.toString())
}
