package com.felipemazetti.logicadeprogramacao.Matriz

fun main (){

    print("Qual a ordem da matriz? ")
    val n = readln().toInt()

    val mat = Array(n) { Array(n) {0.0} }
    val soma = Array(n) { Array(n) {0.0} }
    var somaPositivo = 0.0

    for (i in 0 until n ){
        for (j in 0 until n){
            print("Elemento [$i][$j]: ")
            mat[i][j] = readln().toDouble()
        }
    }

    for (i in 0 until n ){
        for (j in 0 until n){
            if (mat[i][j] > 0){
                somaPositivo += mat[i][j]
            }
        }
    }

    println("\nSOMA DOS POSITIVOS: $somaPositivo")


    print("\nEscolha uma linha: ")
    val l = readln().toInt()

    print("LINHA ESCOLHIDA: ")
    for (j in 0 until n){
        print("${mat [l][j]} ")
    }


    println("")
    print("\nEscolha uma coluna: ")
    val c = readln().toInt()

    print("COLUNA ESCOLHIDA: ")
    for (i in 0 until n ){
        print("${mat [i][c]} ")
    }

    println("\n")
    print("DIAGONAL PRINCIPAL: ")
    for (i in 0 until n ){
        print(" ${mat [i][i]}")
    }

    for (i in 0 until n ){
        for (j in 0 until n){
            soma[i][j] = mat[i][j]
            if (mat[i][j] < 0){
               soma[i][j] = mat[i][j] * mat[i][j]
            }
        }
    }
    println("")
    println("\nMATRIZ ALTERADA: ")
    for (i in 0 until n ){
        for (j in 0 until n){
            print("${soma[i][j]} " )
        }
        println("")
    }







}