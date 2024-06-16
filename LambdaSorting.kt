fun main() {
    val people = listOf(
        "Rakhi" to 30,
        "ananya" to 25,
        "deepa" to 35,
        "Nirlipta" to 20
    )

    val sortedPeople = people.sortedBy { it.second }
    
    println(sortedPeople)
}