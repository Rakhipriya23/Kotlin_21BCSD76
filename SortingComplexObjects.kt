data class Person(val name: String, val age: Int)

fun main() {
    val persons = listOf(
        Person("Ankit", 22),
        Person("Bhushan", 30),
        Person("Amish", 40),
        Person("Bipul", 40),
        Person("Deepansh", 25),
        Person("Vishal", 20)
    )

    
    val sortedPersons = persons.sortedWith(compareBy({ it.age }, { it.name }))
    sortedPersons.forEach { println("${it.name} (${it.age})") }
}
