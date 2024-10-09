class CircularListQueue<T> {
    private var list = mutableListOf<T>()
    private var front = -1
    private var rear = -1

    fun isEmpty(): Boolean {
        return (front == -1)
    }

    fun enqueue(item: T) {
        // Empty list, special case
        if (list.count() == 0) {
            list.add(item)
            front = 0
            rear = 0
        }


        if (rear < list.count()) {
            list[rear] = item
        } else {
            list.add(item)
        }
    }
