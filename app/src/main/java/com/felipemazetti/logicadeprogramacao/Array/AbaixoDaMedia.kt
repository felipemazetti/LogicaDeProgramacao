package com.felipemazetti.logicadeprogramacao.Array

fun main (){

    print("Quantos elementos vai ter o vetor: ")
    val n = readln().toInt()

    val vetor = DoubleArray(n)
    var soma = 0.0

    for(i in 0 until n ){
        print("Digite um numero: ")
        vetor[i] = readln().toDouble()
    }

    for (i in 0 until n){
        soma += vetor[i]
    }

    val media = soma / n

    println("\nMEDIA DO VETOR: %.3f".format(media))
    println("ELEMENTOS ABAIXO DA MEDIA: ")
    for(i in 0 until n ){
        if (vetor[i] < media){
            println(vetor[i])
        }
    }


}