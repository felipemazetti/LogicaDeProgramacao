package com.felipemazetti.logicadeprogramacao.For

fun main(){

    print("Deseja a tabuada para qual valor: ")
    val numero = readln().toInt()

    for (i in  1..10){
        val x = numero * i
        println("$numero x $i = $x")

    }


}