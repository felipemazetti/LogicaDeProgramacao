package com.felipemazetti.logicadeprogramacao.Array

fun main (){

    print("Quantos numeros voce vai digitar? ")
    val n = readln().toInt()

    val vetor = IntArray(n)

    var contpares = 0

    for (i in 0 until n){
        print("Digite um numero: ")
        vetor[i] = readln().toInt()
    }

    println("\nNUMEROS PARES:")
    for (i in 0 until n){
        if (vetor[i] % 2 == 0){
            print(" "+vetor[i])
            contpares ++
        }
    }

    print("\nQUANTIDADE DE PARES = $contpares")




}