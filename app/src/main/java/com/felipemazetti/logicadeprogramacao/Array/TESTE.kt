package com.felipemazetti.logicadeprogramacao.Array

fun main(){

    val mat = Array(3){ Array(3) {0} }

    println("\nInforme o preço básico e excedente de cada tipo de conta: ")
    for (i in 0 until 3){
        println("Tipo $i: ")
        for (j in 0 until 2){
            mat[i][j] = readln().toInt()
        }
    }
}