fun main() {
    val strings = listOf("apple", "Banana", "cat", "Dog", "elephant", "Ant")
    
    val startingLetter = 'a'
    
    val result = strings
        .filter { it.startsWith(startingLetter, ignoreCase = true) }  // Filter by starting letter (case-insensitive)
        .map { it.uppercase() }  
        .sorted()
    
    println("Filtered, uppercase, and sorted strings starting with '$startingLetter': $result")
}
