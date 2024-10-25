// Structurally recursive queue
// Completely empty: all are null
// One item: it's in front
// Two items: front and rear (inside is null)
// More than that....
class RQueue<T> {
    var front: T? = null
    var rear: T? = null
    var inside: RQueue<T>? = null

    fun enqueue(value: T) {
        // no items
        if (front == null) {
            front = value
            return
        }

        // just one item
        if (rear == null) {
            rear = value
            return
        }

        // recursive case
        if (inside == null) {
            inside = RQueue<T>()
        }

        inside.enqueue(rear)
        rear = value
    }



    }

    override fun toString(): String {

    }

}
