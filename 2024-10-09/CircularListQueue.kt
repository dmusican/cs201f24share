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

        // Queue is empty, but list is there
        else if (front == -1) {
            front = 0
            rear = 0
            list[0] = item
        }

        // Queue has room
        else if ((rear + 1) % list.count() < front) {
            rear = (rear + 1) % list.count()
            list[rear] = item
        }
    }
