class Counter {
    // Instance variables
    var value = 0

    fun click() {
        value = value + 1
    }

    fun reset() {
        value = 0
    }
}
fun main() {
    val mycounter = Counter()
    mycounter.reset()
    mycounter.click()
    mycounter.click()
    println(mycounter.value)
    mycounter.click()
    println(mycounter.value)
}