interface Shape {
    fun area(): Double
    fun perimeter(): Double
}

class Rectangle(var length: Double,
                var width: Double) : Shape {
    override fun area(): Double {
        return length * width
    }
    override fun perimeter(): Double {
        return 2*length + 2*width
    }
}

class Circle(var radius: Double) : Shape {
    override fun area(): Double {
        return Math.PI * radius * radius
    }
    override fun perimeter(): Double {
        return 2 * Math.PI * radius
    }
}

fun main() {
    print("(r)ectangle or (c)ircle? ")
    val choice = readln()
    var s: Shape
    if (choice == "r") {
        s = Rectangle(3.2, 6.7)
    } else {
        s = Circle(6.1)
    }
    println(s.area())
    println(s.perimeter())
}








