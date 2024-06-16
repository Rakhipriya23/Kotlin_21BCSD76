fun accessArrayElement(array: List<Int>, index: Int) {
    return try {
        val element = array[index]
        println("Element at index $index: $element")
       
    } catch (e: ArrayIndexOutOfBoundsException) {
        println("Error: ${e.message}")
      
    } finally {
        println("End of operation for index $index.")
    }
}

fun main() {
    val myArray = listOf(10, 20, 30, 40, 50)
	println("For array ")
    println(myArray)
    println("Accessing valid index:")
    accessArrayElement(myArray, 2) 

    println("\nAccessing invalid index:")
    accessArrayElement(myArray, 10) 
}