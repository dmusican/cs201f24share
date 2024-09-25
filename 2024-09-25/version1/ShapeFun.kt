class Rectangle(var length: Double,
                var width: Double) {
    fun area(): Double {
        return length * width
    }
    fun perimeter(): Double {
        return 2*length + 2*width
    }
}