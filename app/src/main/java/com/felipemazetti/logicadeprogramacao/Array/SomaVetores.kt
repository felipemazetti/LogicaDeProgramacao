package com.felipemazetti.logicadeprogramacao.Array

fun main(){

    print("Quantos valores terá cada vetor? ")
    val n = readln().toInt()

    val vetorA = IntArray(n)
    val vetorB = IntArray(n)

    println("Digite os valores do vetor A: ")
    for (i in 0 until n){
        vetorA[i] = readln().toInt()
    }

    println("Digite os valores do vetor B: ")
    for (i in 0 until n){
        vetorB[i] = readln().toInt()
    }

    println("VETOR RESULTANTE: ")
    for (i in 0 until n){
        var resultado = vetorA[i] + vetorB[i]
        println(resultado)

    }




}