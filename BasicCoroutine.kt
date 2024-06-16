import kotlinx.coroutines.*
fun main()= runBlocking{
    println("Start of main")
    launch{
        println("Hello")
        delay(1000L)
        println("World")
    }
    println("End of main")
}