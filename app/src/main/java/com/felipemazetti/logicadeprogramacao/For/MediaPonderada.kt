package com.felipemazetti.logicadeprogramacao.For

fun main(){

    print("Quantos casos voce ira digitar? ")
    val n = readln().toInt()

    for(i in 1..n){
        println("Digite tres numeros: ")
        val num1 = readln().toDouble()
        val num2 = readln().toDouble()
        val num3 = readln().toDouble()
        val ponderada = (num1*2 + num2*3 + num3*5 ) /10
        println("MEDIA: %.1f".format(ponderada))

    }




}