package com.felipemazetti.logicadeprogramacao.Array

fun main(){

    print("Quantos numeros voce vai digitar? ")
    val n = readln().toInt()
    var resultado = 0.0
    var soma = 0.0

    val vetor = DoubleArray(n)

    for (i in 0 until n){
        print("Digite um numero: ")
        vetor[i] = readln().toDouble()
    }
    print("\nVALORES =")
    for (i in 0 until n ){
        print("  " + vetor[i])
        soma += vetor[i]
    }
    println("\nSOMA = $soma")
    val media =  soma / n
    println("MEDIA = $media")







}