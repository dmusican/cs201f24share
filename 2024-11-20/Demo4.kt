class Thing {
    var word: String? = null

    fun countit(): Int {
        if (word != null) {
            return word.count()
        } else {
            return 0
        }
    }
}

fun main() {
    val t = Thing()
    println(t.countit())
}
