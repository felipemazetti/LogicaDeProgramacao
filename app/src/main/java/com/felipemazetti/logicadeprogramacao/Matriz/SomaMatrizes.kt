package com.felipemazetti.logicadeprogramacao.Matriz

fun main (){

    print("Quantas linhas vai ter cada matriz? ")
    val linhas = readln().toInt()
    print("Quantas colunas vai ter cada matriz? ")
    val colunas = readln().toInt()

    val matrizA = Array(linhas) { Array(colunas) {0} }
    val matrizB = Array(linhas) { Array(colunas) {0} }
    val soma = Array(linhas) { Array(colunas) {0} }

    println("Digite os valores da matriz A: ")
    for (i in 0 until linhas){
        for (j in 0 until colunas){
            print("Elemento [$i][$j]:")
            matrizA[i][j] = readln().toInt()

        }

    }

    println("Digite os valores da matriz B: ")
    for (i in 0 until linhas){
        for (j in 0 until colunas){
            print("Elemento [$i][$j]:")
            matrizB[i][j] = readln().toInt()

        }

    }
    for (i in 0 until linhas){
        for (j in 0 until colunas){
            soma[i][j] = matrizA[i][j] + matrizB[i][j]
        }
    }
    println("\nMATRIZ SOMA: ")
    for (i in 0 until linhas){
        for (j in 0 until colunas) {
            print("${soma[i][j]} " )
        }
        println("")
    }


}