package operationsAndPriorities

fun main() {
    val foodId = readLine()!!.toInt();

    when (foodId) {
        1 -> {
            println("You got Sandwitch")
            println("You got salad")
        }

        10 -> {
            println("You got burger")
        }

        else -> {
            println("You did not order anything")
        }
    }
}