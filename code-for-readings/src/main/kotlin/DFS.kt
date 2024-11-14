// Kotlin version of depth-first search code from
// https://www.programiz.com/dsa/graph-dfs
// Ported by Dave Musicant
// DFS algorithm in Java

class Graph(vertices: Int) {

    val adjLists = MutableList(vertices, {mutableListOf<Int>()})
    val visited = MutableList(vertices, {false})

    // Add edges
    fun addEdge(src: Int, dest: Int) {
        adjLists[src].add(dest)
    }

    // DFS algorithm
    fun DFS(vertex: Int) {
        visited[vertex] = true
        print("$vertex ")

        for (adj in adjLists[vertex]) {
            if (!visited[adj])
                DFS(adj);
        }
    }
}

fun main() {
    val g = Graph(4)

    g.addEdge(0, 1)
    g.addEdge(0, 2)
    g.addEdge(1, 2)
    g.addEdge(2, 3)

    println("Following is Depth First Traversal")

    g.DFS(0)
}
