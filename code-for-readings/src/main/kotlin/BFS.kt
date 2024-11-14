// Kotlin version of breadth-first search code from
// https://www.programiz.com/dsa/graph-bfs
// Ported by Dave Musicant
// DFS algorithm in Java

class Graph(var vertices: Int) {

    val adj = MutableList(vertices, {mutableListOf<Int>()})

    // Add edges
    fun addEdge(src: Int, dest: Int) {
        adj[src].add(dest)
    }

    // BFS algorithm
    fun BFS(start: Int) {

        val visited = MutableList(vertices, {false})
        val queue = ArrayDeque<Int>()

        visited[start] = true
        queue.addLast(start)

        while (queue.isNotEmpty()) {
            val s = queue.removeFirst()
            System.out.print("$s ")

            for (n in adj[s]) {
                if (!visited[n]) {
                    visited[n] = true
                    queue.addLast(n)
                }
            }
        }
    }
}

fun main() {
    val g = Graph(4)

    g.addEdge(0, 1)
    g.addEdge(0, 2)
    g.addEdge(1, 2)
    g.addEdge(2, 0)
    g.addEdge(2, 3)
    g.addEdge(3, 3)

    println("Following is Breadth First Traversal " + "(starting from vertex 2)")

    g.BFS(2)
}
