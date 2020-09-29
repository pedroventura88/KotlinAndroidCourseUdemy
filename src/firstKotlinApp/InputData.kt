package firstKotlinApp

fun main(){

    //O uso dos 2  (!!) informam que o campo NÃO PODE SER NULL

    print("Enter Name")
    val name:String = readLine()!!.toString();
    print("Enter Age")
    val age = readLine()!!.toInt();
    print("Enter Salary")
    val salary = readLine()!!.toDouble();

    println("===== User Info ===== ")
    println("Name: $name")
    println("Age: $age")
    println("Salary: $salary")

}