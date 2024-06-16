fun flattenList(num : List<List<Int>>) : List<Int> {
    var result : MutableList<Int> = mutableListOf()
    for(List in num){
        for(Number in List){
            if(!result.contains(Number)){
                result.add(Number)
            }
        }
    }
    return(result)
}

fun main(){
    var num1 = listOf(1,2,3,4,5)
    var num2 = listOf(5,6,7,8,9)
    var num3 = listOf(9,10,11,12,13)
    var num = listOf(num1,num2,num3)
    println(num)
    var newnum = flattenList(num)
    println("Flattened List is $newnum")
}
