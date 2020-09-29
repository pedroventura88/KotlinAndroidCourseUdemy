package LoopControl

fun main() {
    print("Start App")
    for (i in 1..5) {
        println("Hello World $i")
    }

    print("======= Increment - 2 by 2 ======= ")
    for (i in 1..50 step 2) {
        println("Number: $i")
    }

    print("======= Decrement ======= ")
    for (i in 100 downTo 0) {
        println("Number: $i")
    }

    println("End App")
}