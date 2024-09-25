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
    if (choice == "r") {
        val r = Rectangle(3.2, 6.7)
        println(r.area())
        println(r.perimeter())
    } else {
        val c = Circle(6.1)
        println(c.area())
        println(c.perimeter())     
    }
}








