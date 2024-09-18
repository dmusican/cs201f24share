fun main()
{
    var secret = 47
    var guess = -1

    print("What is your guess? ")
    guess = readln().toInt()
    if (guess > secret)
    {
        println("Too big")
    }
    else if (guess < secret)
    {
        println("Too small")
    }
    else
    {
        println("You got it")
    }
}

