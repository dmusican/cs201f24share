fun main() {
    val die1 = Die(6)
    die1.roll()
    println(die1.showing)
    die1.roll()
    println(die1.showing)
    
    val die2 = Die(20)
    die2.roll()
    println(die2.showing)
}