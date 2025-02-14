package com.felipemazetti.logicadeprogramacao.Array

fun main(){

    print("Quantos numeros voce vai digitar? ")
    val n = readln().toInt()

    val vetor = DoubleArray(n)
    var maior = 0.0
    var posicao = 0

    for (i in 0 until n){
        print("Digite um numero: ")
        vetor[i] = readln().toDouble()

    }

    for(i in 0 until n) {
        if( vetor[i] > maior){
            maior = vetor[i]
            posicao = i
        }
    }

    println("\nMAIOR VALOR: $maior")
    print("POSICAO DO MAIOR VALOR: $posicao")



}