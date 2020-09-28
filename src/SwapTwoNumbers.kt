fun main() {

    // Codigo estará atribuindo novos valores as variaveis
    var x:Int = 10;
    var y:Int = 20;

    println("X = $x, Y = $y")

    print("Insert the new value for X: ")
    val newX = readLine()!!.toInt();

    print("Insert the new value for Y: ")
    val newY = readLine()!!.toInt();

    x = newX;
    y = newY;

    println("(X = $x) // (Y = $y)")

}