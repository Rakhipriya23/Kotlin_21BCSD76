//q3 companion objects

fun main() {
   val user1 = User.Create()
   println(user1)
   
   val user2= User.Create(name="Rakhi")
   println(user2)
   
   val user3= User.Create(name ="Gitam",age =23)
   println(user3)
}
class User(val name:String,val age:Int){
    companion object {
        fun Create(name : String = "Unknown",age : Int = 22) : User{
            return User(name,age)
        }
    }
     override fun toString(): String {
        return "User(name='$name', age=$age)"
    }
    
}