// q2 data class and copy function

fun main() {
    val person = Person(name ="Rakhi", address="cuttack", age=21)
    println(person)
    
    val copyperson = person.copy(address="bbsr", age=22)
    println(copyperson)
}
data class Person(val name: String,val address: String,val age: Int)