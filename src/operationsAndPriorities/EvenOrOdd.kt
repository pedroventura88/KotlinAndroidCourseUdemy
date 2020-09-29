package operationsAndPriorities

fun main() {

    print("Insert number: ")
    val number = readLine()!!.toInt();

    if (number % 2 == 0) {
        println("Is odd")
    } else {
        println("Is Even")
    }

}