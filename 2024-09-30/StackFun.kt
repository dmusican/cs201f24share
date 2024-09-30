interface Stack {
    fun push(item: Int)
    fun pop(): Int
    fun peek(): Int
    fun isEmpty(): Boolean
}

class ArrayStack : Stack {
    // Initial array of size 10
    var array = arrayOfNulls<Int>(10)
