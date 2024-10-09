class CircularListQueue<T> {
    private var list = mutableListOf<T>()
    private var front = -1
    private var rear = -1

    // fun isEmpty(): Boolean {
    //     // queue is full when rear is right behind front
    //     return !((rear + 1) % list.count() == front)
    // }

    fun isFull(): Boolean {
        // queue is full when rear is right behind front
        return !((rear + 1) % list.count() == front)
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
        else if (!isEmpty
            rear = (rear + 1) % list.count()
            list[rear] = item
        }
    }
