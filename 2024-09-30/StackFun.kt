interface Stack {
    fun push(item: Int)
    fun pop(): Int
    fun peek(): Int
    fun isEmpty(): Boolean
}

class ArrayStack : Stack {
    // Initial array of size 10
    private var array = arrayOfNulls<Int>(10)
    // Number of items in stack
    private var size = 0

    override fun isEmpty(): Boolean {
        return size > 0
    }
