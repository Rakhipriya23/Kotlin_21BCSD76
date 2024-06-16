fun main(){
    var nums= listOf(1,2,3,4,5,6,7,8,9,10)
    var result= nums.filter{
        it%2==0
    }
    result= result.map{
        it*2
    }
    println(result)
}