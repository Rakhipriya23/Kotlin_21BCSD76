//q1 inheritance and polymorphism
fun main() {
    val react = reactangle(2.0,3.0)
    val circ = circle(2.0)
    println(" Reactangle Area: ${react.area()}")
    println(" Reactangle perimeter: ${react.perimeter()}")
    
    println(" Circle Area: ${circ.area()}")
    println(" Circle perimeter: ${circ.perimeter()}")
}
abstract class Shape{
    abstract fun area() : Double
}

class reactangle(var width :Double,var height: Double) : Shape() {
    override fun area() :Double{
        return width*height
    }
    
    fun perimeter() :Double{
        return 2 * (width + height)
    }
}

class circle(var radius : Double) : Shape(){
     override fun area() :Double{
        return 3.14 * radius * radius
    }
    
    fun perimeter() :Double{
        return 2 * 3.14 * radius
    }
}