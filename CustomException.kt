class InvalidAgeException(message: String) : Exception(message)
fun checkAge(age : Int){
    if(age<18){
        throw InvalidAgeException("Below 18 age is invalid, your provided age is $age, so invalid")
    }
    else{
        println("Age $age is valid")
    }
}

fun main(){
    var age1:Int= 25
    var age2:Int = 15
    checkAge(age1)
    checkAge(age2)
}