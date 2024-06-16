fun mapping(num : List<Int>): MutableMap<Int,Int> {
    var result : MutableMap<Int,Int> = mutableMapOf()
    for(item in num){
        result[item]= result.getOrDefault(item,0)+1
    }
    return result
}

fun main(){
    var nums= listOf(1,2,3,4,5,1,1,2,3,3,3,3,4,5,5,5)
    var numsmap= mapping(nums)
    println("The frequency map of list $nums is $numsmap")
}