package com.felipemazetti.logicadeprogramacao.Array

fun main(){

    print("Quantos numeros voce vai digitar? ")
    val n = readln().toInt()

    val vetor = IntArray(10)

    for ( i in 0 until n){
        print("Digite um numero: ")
        vetor[i] = readln().toInt()
    }

    println("\nNUMEROS NEGATIVOS")

    for (i in 0 until n ){
        if (vetor[i] < 0){
            println(vetor[i])
        }

    }



}