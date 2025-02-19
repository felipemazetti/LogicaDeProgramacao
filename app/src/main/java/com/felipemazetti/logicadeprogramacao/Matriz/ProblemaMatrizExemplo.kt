package com.felipemazetti.logicadeprogramacao.Matriz

fun main(){

    print("Quantas linhas terá a matriz: ")
    val linhas = readln().toInt()
    print("Quantas colunas terá a matriz: ")
    val colunas = readln().toInt()

    val matriz = Array(linhas) { Array(colunas) {0} }

    for (i in 0 until linhas){
        for (j in 0 until colunas){
            print("Elemento [$i][$j]: ")
            matriz[i][j] = readln().toInt()
        }
    }

    println("\nMATRIZ DIGITADA: ")
    for (linhas in matriz){
        println(linhas.contentToString())

    }


}