fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val result = numbers
        .map { it * it }            
        .filter { it % 2 != 0 }      
        .reduce { sum, number -> sum + number } 
    println("The result is: $result")
}