//q5 Sigleton objects

fun main() {
    DatabaseConnection.connect()
    DatabaseConnection.disconnect()
    
   DatabaseConnection.connect()
    
}
object DatabaseConnection {
    init {
        println("DatabaseConnection initialized")
    }

    fun connect() {
        println("Connecting to the database...")
    }

    fun disconnect() {
        println("Disconnecting from the database...")
    }
}

