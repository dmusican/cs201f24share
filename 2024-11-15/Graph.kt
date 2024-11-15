
class Graph(var numVertices: Int) {

    var adjacencyMatrix = MutableList(numVertices) {MutableList(numVertices) {false}}

    fun addEdge(vertex1: Int, vertex2: Int) {
        adjacencyMatrix[vertex1][vertex2] = true
        adjacencyMatrix[vertex2][vertex1] = true
    }

    fun depthFirstDisplay(startVertex: Int) {
        val visited = MutableList(numVertices) {false}
        _depthFirstDisplay(startVertex, visited)
    }

    private fun _depthFirstDisplay(vertex: Int, visited: MutableList<Boolean>) {

        if (visited[vertex]) {
            return
        } else {
            visited[vertex] = true
            println("Visiting " + vertex)
            for (j in 0..<numVertices) {

                if (adjacencyMatrix[vertex][j]) {

                    _depthFirstDisplay(j, visited)
                }
            }
        }
    }

    fun breadthFirstDisplay(vertex: Int) {
        var queue = ArrayDeque<Int>()
        val visited = MutableList(numVertices) {false}

        visited[vertex] = true
        println("Visiting " + vertex)

        queue.addLast(__________________________________)

        while (!queue.isEmpty()) {

            val currentVertex = queue.removeFirst()

            for (next in 0..<numVertices) {

                if (______________________________________________) {

                    visited[_______________________________] = true
                    println("Visiting " + next)

                    queue.addLast(_________________________________)
                }
            }
        }
    }

    fun printShortestPath(startVertex: Int, endVertex: Int) {

        val queue = ArrayDeque<Int>()
        val visited = mutableMapOf<Int, Int>()  // both visited and vertex -> previous

        queue.addLast(startVertex)

        var currentVertex = -1 // just an init value
        while (queue.isNotEmpty()) {

            currentVertex = queue.removeFirst()

            if (_______________________________________________) {
                break
            }

            // Visit all adjacent vertices
            for (next in 0..<numVertices) {
                if (adjacencyMatrix[currentVertex][next] && (________________________________) {

                    visited[next] = ______________________________________________


                    queue.addLast(____________________________________________)
                }
            }
        }


        if (currentVertex == ___________________________________) {
            println("Shortest path backwards from $startVertex to $endVertex: ")
            while (currentVertex != startVertex) {
                print("$currentVertex ")

                currentVertex = ___________________________________________
            }
            println(startVertex)
        } else {
            println("Couldn't get from $startVertex to $endVertex.")
        }

    }
    }


fun main() {
    val graph = Graph(numVertices=7)
    graph.addEdge(1,3)
    graph.addEdge(1,4)
    graph.addEdge(3,5)
    graph.addEdge(5,6)
    graph.addEdge(5,2)

    println("Depth first:")
    graph.depthFirstDisplay(1)
    println("Breadth first:")
    graph.breadthFirstDisplay(1)
}
