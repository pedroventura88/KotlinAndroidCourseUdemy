package LoopControl

fun main() {
    println("Continue example..")
    for (number in 1..10) {
        //esse trecho abaixo, irá ignorar o numero 5.
        if (number == 5) {
            continue
        }
        println(number)
    }

    println("Break example..")
    for (number in 1..10) {
        //esse trecho abaixo, irá parar a execução quando number for igual a 6
        if (number == 6) {
            break
        }
        println(number)
    }

    println("Break Inner Example..")
    /** A notação loop@ fará com que o break dentro do if, pare a execução do loop externo. **/
    loop@ for (number in 1..10) {
        println("Number: $number")
        for (innerLoop in 1..7) {
            println("InnerLoop: $innerLoop")
            if (innerLoop == 6) {
                break@loop
            }
        }
    }
}