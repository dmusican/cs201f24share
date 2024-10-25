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

    }

    override fun toString(): String {

    }

}
