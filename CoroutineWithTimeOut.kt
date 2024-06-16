import kotlinx.coroutines.*

fun main() = runBlocking {
    try {
        // Start a coroutine with a timeout of 2 seconds
        withTimeout(2000L) {
            println("Long-running task started.")
            performLongRunningTask()
            println("Long-running task completed.")
        }
    } catch (e: TimeoutCancellationException) {
        println("Task was cancelled because it took too long.")
    }
}

suspend fun performLongRunningTask() {
    // Simulate a long-running task
    for (i in 1..10) {
        println("Working... step $i")
        delay(500L) // Delay for 500 milliseconds per step
    }
}
