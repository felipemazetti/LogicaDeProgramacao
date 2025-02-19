package com.felipemazetti.logicadeprogramacao.Matriz

fun main (){

    print("Qual a ordem da matriz? ")
    val n = readln().toInt()

    val mat = Array(n) { Array(n) {0} }
    var soma = 0

    for (i in 0 until n){
        for (j in 0 until n ){
            print("Elemento [$i][$j]: ")
            mat[i][j] = readln().toInt()

            if (j > i ){
                soma += mat[i][j]
            }
        }
    }


    print("SOMA DOS ELEMNTOS ACIMA DA DIAGONAL PRINCIPAL = $soma")




}