package operationsAndPriorities

fun main() {

    print("Enter number one: ")
    val number1 = readLine()!!.toDouble();

    print("Enter number two: ")
    val number2 = readLine()!!.toDouble();

    val sum = number1 + number2;
    println("Sum: $sum")

    val subtraction = number1 - number2;
    println("Subtraction: $subtraction")

    val multiplication = number1 * number2;
    println("Mult: $multiplication")


    val division = number1 / number2;
    println("Div: $division")

}