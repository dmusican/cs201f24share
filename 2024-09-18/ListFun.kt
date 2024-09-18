fun main()
{
    val things = listOf(12, 19, 27)
    println(things.count())
    println(things[0])
    //println(things[12])
    //things[0] = 19

    val morethings = mutableListOf(19, 62, 128, 34)
    morethings[0] = 17
    println(morethings)
}

 