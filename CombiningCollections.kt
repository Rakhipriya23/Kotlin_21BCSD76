fun alternateLists(list1: List<Int>, list2: List<Int>): List<Int> {
    val result = mutableListOf<Int>()
    val minSize = minOf(list1.size, list2.size)
    
    
    for (i in 0 until minSize) {
        result.add(list1[i])
        result.add(list2[i])
    }
    
    
    if (list1.size > list2.size) {
        result.addAll(list1.subList(minSize, list1.size))
    } else if (list2.size > list1.size) {
        result.addAll(list2.subList(minSize, list2.size))
    }
    
    return result
}

fun main() {
    
    val list1 = listOf(1, 2, 3, 4)
    val list2 = listOf(5, 6, 7)

    
    val alternatedList = alternateLists(list1, list2)
    
    println("Alternated List: $alternatedList") // Output: Alternated List: [1, 5, 2, 6, 3, 7, 4]
}
