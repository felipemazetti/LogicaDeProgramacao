package com.felipemazetti.logicadeprogramacao.For

fun main(){

    print("Digite o valor de X: ")
    val x = readln().toInt()

    for (i in 1..x){
        if (i % 2 != 0){
            println(i)
        }
    }



}