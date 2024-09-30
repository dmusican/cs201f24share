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
    private var stackSize = 0

    override fun isEmpty(): Boolean {
        return stackSize == 0
    }

    override fun push(item: Int) {
        if (stackSize >= array.count()) {
            val newArray =
                arrayOfNulls<Int>(array.count()*2)
            // Copy contents of old array
            for (i in array.indices) {
                newArray[i] = array[i]
            }
            array = newArray
        }
        array[stackSize] = item
        stackSize++
    }

    override fun peek(): Int {
        if (stackSize == 0) {
            throw RuntimeException("Stack is empty!")
        }
        // I know, based on my code above, that below
        // can't be null, and if it is, it is a bug in my
        // code, and I want to see that error happen
        return array[stackSize-1]!!
    }
}
