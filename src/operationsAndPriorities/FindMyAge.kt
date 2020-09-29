package operationsAndPriorities

import java.util.*

fun main() {
    print("Enter Year of Birth: ")
    val  year = readLine()!!.toInt();
    val yearInDevice = Calendar.getInstance().get(Calendar.YEAR)
    val age = yearInDevice - year;
    println("You are $age years old")

}