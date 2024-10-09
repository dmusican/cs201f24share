class ListQueue<T> {
    private var list = mutableListOf<T>()
    private var front = -1
    private var rear = -1

    fun isEmpty(): Boolean {
        return (front == -1)
    }

    fun enqueue(item: T) {
        // Empty queue?
        if (front == -1) {
            front = 0
            rear = 0
        } else {
            rear = rear + 1
        }
