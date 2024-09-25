class Rectangle(var length: Double,
                var width: Double) {
    fun area(): Double {
        return length * width
    }
    fun perimeter(): Double {
        return 2*length + 2*width
    }
}

class Circle(var radius: Double) {
    fun area(): Double {
        return Math.PI * radius * radius
    }
    fun perimeter(): Double {
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








