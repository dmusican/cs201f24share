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
