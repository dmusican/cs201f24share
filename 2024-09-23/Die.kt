class Die(val numSides: Int) {
    var showing = 1

    companion object {
        var numDice = 0
    }

    // Function that is run right away
    // when object is getting made
    init {
        println("I am initting.")
        println("numSides is $numSides")
        if (numSides < 0) {
            throw RuntimeException(
                "negative sides is bad, don't do that Dave")
        }
        numDice = numDice + 1
    }

    // Run this when making an object with
    // parameters as specified
    constructor(): this(6) {
        println("Running with new constructor")
    }

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
    println("Num dice = ${Die.numDice}")
    
    val die2 = Die(20)
    die2.roll()
    println(die2.showing)
    println("Num dice = ${Die.numDice}")
}



//class Die(val numSides: Int = 6) {
