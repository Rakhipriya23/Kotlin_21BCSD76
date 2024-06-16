fun computeFactorial(num :Int, operation: (Int)->Long): Long{
    return(operation(num))
}
fun main(){
    var num:Int= 6
    var factorial: (Int)->Long= {
        n->
        var result:Long=1
        for(i in 2..n){
            result= result * i.toLong()
        }
        result
    }
    println("Factorial of $num is ${computeFactorial(num,factorial)}")
}