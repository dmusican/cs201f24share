class Student(var name: String,
              var age: Int) {
    
    var gradStatus: String? = null

    fun getClassYear(): String {
        if (gradStatus == null) {
            return "undefined"
        }
        
        return gradStatus.substring(0,2)
    }
 
    fun doBirthday() {
        age = age + 1
    }
}

fun main() {
    val s1 = Student("Dave", 20)
    val s2 = Student("Schiller", 140)
    s1.gradStatus = "SO05" // soph 5th term
    s1.doBirthday()
    println(s1.age)
    println(s1.gradStatus)
    println(s2.gradStatus)
}