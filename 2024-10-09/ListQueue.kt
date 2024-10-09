class ListQueue<T> {
    private var list = mutableListOf<T>()
    private var front = -1
    private var rear = -1

    fun isEmpty(): Boolean {
        return (front == -1)
    }
