fun main()
{
    val name = "hello friend"
    // for (letter in name)
    // {
    //     println(letter)
    // }

    // Print every other letter
    for (index in 0..<name.count() step 2)
    {
        println(name[index])
    }
}