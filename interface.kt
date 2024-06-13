//q4 interface

fun main() {
    val squ = square(2.0)
    val tri = triangle(3.0,4.0)
    squ.draw()
    tri.draw()
    
    squ.resize(2.0)
    tri.resize(2.0)
    
    squ.draw()
    tri.draw()
}
interface drawable{
    fun draw()
    fun resize(factor : Double)
}
class square(var side :Double) : drawable{
    override fun draw(){
        println("Drawing a sqare of side length $side")
    }
    override fun resize(factor: Double) {
        side *= factor
        println("Resized Square to new side length $side")
    }
}

class triangle(var base :Double , var height :Double) : drawable{
    override fun draw(){
        println("Drawing a triangle of base $base and height  $height")
    }
    override fun resize(factor: Double) {
        base *= factor
        height *= factor
        println("Resized triangle to new base length $base and new height $height")
    }
}