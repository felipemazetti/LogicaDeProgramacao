package com.felipemazetti.logicadeprogramacao.Matriz

fun main(){

    print("Qual a ordem da matriz? ")
    val n = readln().toInt()

    val matriz = Array(n) {Array(n){0}}
    var maiorElemento = 0

    for (i in 0 until n){
        for (j in 0 until n){
            print("Elemento [$i][$j]: ")
            matriz[i][j] = readln().toInt()

        }
    }

    println("MAIOR ELEMENTO DE CADA LINHA: ")
    for (i in 0 until n){
        maiorElemento = matriz[i][0]

        for (j in 1 until n) {
            if (matriz[i][j] > maiorElemento) {
                maiorElemento = matriz[i][j]
            }
        }
        println(maiorElemento)

    }
}