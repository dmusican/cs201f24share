fun main() {

    // Initialize a list with some values
    // I want to have 0, 5, 10, 15, 20, 25, ...
    var list = MutableList<Int>(10, {index -> index * 5})
    println(list)

    // Shorter
    list = MutableList<Int>(10) {it * 5}
    println(list)

    // Our example
    var list2 = MutableList<Int?>(10) {null}
    println(list2)
}
