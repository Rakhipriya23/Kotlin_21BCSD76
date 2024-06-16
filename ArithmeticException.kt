//Arithmetic exception - try/catch
fun main(){
    var x: Int= 10
    var y: Int= 0
    var result: Int
    try{
        result= x/y
        println(result)
    }
    catch(e: ArithmeticException){
        println("Error occured , can't divide with zero")
        println("${e.message}")
    }
}