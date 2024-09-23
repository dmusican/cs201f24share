class Die(val numSides: Int = 6) {
    var showing = 1

    fun roll() {
        showing = (1..numSides).random()
    }
}

fun main() {
    val die1 = Die()
    die1.roll()
    println(die1.showing)
    die1.roll()
    println(die1.showing)
    
    val die2 = Die(20)
    die2.roll()
    println(die2.showing)
}