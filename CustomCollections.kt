class UniqueList<T> {
  	val items = mutableListOf<T>()

   
    fun add(element: T): Boolean {
        return if (!items.contains(element)) {
            items.add(element)
            true
        } else {
            false
        }
    }

    
    fun remove(element: T): Boolean {
        return items.remove(element)
    }

   
    fun contains(element: T): Boolean {
        return items.contains(element)
    }

    
    fun size(): Int {
        return items.size
    }

    
    fun get(index: Int): T {
        if (index < 0 || index >= items.size) {
            throw IndexOutOfBoundsException("Index: $index, Size: ${items.size}")
        }
        return items[index]
    }

   
    fun getAll(): List<T> {
        return items.toList() 
    }

  
    fun clear() {
        items.clear()
    }

    
    override fun toString(): String {
        return items.toString()
    }
}

fun main() {
    val uniqueList = UniqueList<String>()// you can create any type of object like <Int> <Double>

    println("Adding 'Apple': ${uniqueList.add("Apple")}")
    println("Adding 'Banana': ${uniqueList.add("Banana")}")
    println("Adding 'Apple' again: ${uniqueList.add("Apple")}")
    uniqueList.add("Ankit")
    uniqueList.add("Ankit")
 
    println("Contains 'Apple': ${uniqueList.contains("Apple")}")
    println("Contains 'Grapes': ${uniqueList.contains("Grapes")}")

    
    println("Size of uniqueList: ${uniqueList.size()}")

  
    println("All elements: ${uniqueList.getAll()}")

    
    println("Removing 'Banana': ${uniqueList.remove("Banana")}")
    println("Removing 'Grapes' (non-existent): ${uniqueList.remove("Grapes")}")

    
    println("List after removal: ${uniqueList.getAll()}")

    
    uniqueList.clear()
    println("List after clear: ${uniqueList.getAll()}")
}