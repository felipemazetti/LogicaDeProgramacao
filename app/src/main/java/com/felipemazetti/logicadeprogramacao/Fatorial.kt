package com.felipemazetti.logicadeprogramacao

fun main(){

    print("Digite o valor de N: ")
    val n = readln().toInt()

    var fac: Long = 1
    for (i in 1..n){
        fac *= i
    }

    print("Fatorial = $fac")



}