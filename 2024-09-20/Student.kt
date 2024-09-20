class Student {
    // Instance variables
    var name
    var age

    fun doBirthday() {
        age = age + 1
    }
}

fun main() {
    val s1 = Student("Dave", 20)
    val s2 = Student("Schiller", 140)
    s1.doBirthday()
    println(s1.age)
}