class Thing {
    var word: String? = null

    fun countit(): Int {
        // if (word != null) {
        //     return word.count()
        // } else {
        //     return 0
        // }

        return word?.let {it.count()} ?: 0
    }
}

fun main() {
    val t = Thing()
    println(t.countit())
    t.word = "hello"
    println(t.countit())
}
