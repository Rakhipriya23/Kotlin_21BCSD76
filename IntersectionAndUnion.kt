fun main(){
    var list1= listOf(1,2,3,4,5)
    var list2= listOf(2,7,8,3,9)
    var union : MutableList<Int> = mutableListOf()
    var intersection : MutableList<Int> = mutableListOf()
    for(num in list1){
        if(list2.contains(num)){
           if(!union.contains(num)) union.add(num)
        }
    }
    for(num in list1){
        if(!list2.contains(num)){
           if(!intersection.contains(num)) intersection.add(num)
        }
    }
    for(num in list2){
        if(!list1.contains(num)){
           if(!intersection.contains(num)) intersection.add(num)
        }
    }
    var sortedUnion= union.sorted()
    var sortedIntersection= intersection.sorted()
    println("Union and intersection of $list1 and $list2 are")
    println("Union- $sortedUnion , Intersection- $sortedIntersection")
}