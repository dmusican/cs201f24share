class Die(val numSides: Int = 6) {
    var showing = 1

    // Function that is run right away
    // when object is getting made
    init {
        if (numSides < 0) {
            throw RuntimeException(
                "negative sides is bad, don't do that Dave")
        }
    }

    fun roll() {
        showing = (1..numSides).random()
    }
}

fun main() {
    val die1 = Die(-1)
    die1.roll()
    println(die1.showing)
    die1.roll()
    println(die1.showing)
    
    val die2 = Die(20)
    die2.roll()
    println(die2.showing)
}