fun addItUp(listToAdd)
{
    var total = 0
    for (number in listToAdd)
    {
        total = number + total
    }
}

fun main()
{
    val list1 = listOf(9, 2, 3, 5, 7)
    val total = addItUp(list1)
    println(total)

}