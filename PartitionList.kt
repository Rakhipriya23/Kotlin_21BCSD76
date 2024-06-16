fun main(){
    var list = listOf(1,2,3,4,5,6,7,8,9,10)
    var list1= list.filter{it%2!=0}
    var list2= list.filter{it%2==0}
    println("Partition of list $list is")
    println("List 1 - $list1")
    println("List 2- $list2")
}