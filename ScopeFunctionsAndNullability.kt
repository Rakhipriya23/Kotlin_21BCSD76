fun sortAndPrintList(numbers: List<Int>?) {
    numbers?.run {
        val sortedList = sorted()
        println("Sorted list: $sortedList")
    }
}

fun main() {
    val nullableList: List<Int>? = listOf(3, 1, 5, 2, 4)
    val nullList: List<Int>? = null

    // Sort and print non-null list
    sortAndPrintList(nullableList)

    // Sort and print null list (nothing will be printed)
    sortAndPrintList(nullList)
}
