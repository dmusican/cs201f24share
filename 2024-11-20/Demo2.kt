data class Person(
    val name: String,
    val age: Int
)

fun main() {
    val people = listOf(Person("Alice", 29),
                        Person("Bob", 31))
    // print out the oldest person
    val result = people.maxByOrNull( {person: Person -> person.age} )
    print(result)
}
