package com.felipemazetti.logicadeprogramacao.Matriz

fun main(){

    print("Qual a quantidade de linhas da matriz? ")
    val linhas = readln().toInt()
    print("Qual a quantidade de colunas? ")
    val colunas = readln().toInt()

    val matriz = Array(linhas){Array(colunas) {0} }

    val soma = Array(linhas){0}

    for (i in 0 until linhas){
        println("Digite os elementos da " + (i+1)+ "a. Linha: ")
        soma[i] = 0
        for (j in 0 until colunas){
            matriz[i][j] = readln().toInt()
            soma[i] += matriz[i][j]
        }

    }

    println("\nVETOR GERADO: ")
    for (i in 0 until linhas){
        println(soma[i].toDouble())
    }

}