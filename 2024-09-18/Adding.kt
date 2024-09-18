fun addItUp(listToAdd: List<Int>,
            finalNumber: Int): Int
{
    var total = 0
    for (number in listToAdd)
    {
        total = number + total
    }
    total = total + finalNumber
    return total
}

fun main()
{
    val list1 = listOf(9, 2, 3, 5, 7)
    val total = addItUp(list1, 19)
    println("The total, my friend, is $total")

}