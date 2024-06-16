fun main() {
    val strings = listOf("ankit", "bansal", "aryan", "bimal", "amish", "vishal", "vikash", "bhusan")

    
    val groupedByFirstChar = strings.groupBy { it.first() }

    
    val countByFirstChar = groupedByFirstChar.mapValues { it.value.size }

    
    println("Grouped by first character: $groupedByFirstChar")
    println("Count by first character: $countByFirstChar")
}