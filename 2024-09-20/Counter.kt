fun main() {
    val mycounter = Counter()
    mycounter.reset()
    mycounter.click()
    mycounter.click()
    println(mycounter.value)
    mycounter.click()
    println(mycounter.value)
}