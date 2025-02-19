package com.felipemazetti.logicadeprogramacao.Matriz



fun main (){

    print("Qual a ordem da matriz ? ")
    val n = readln().toInt()

    val matriz = Array(n) {Array(n) {0} }
    var cont = 0

    for (i in 0 until n){
        for (j in 0 until n){
            print("Elemento [$i][$j]: ")
            matriz[i][j] = readln().toInt()

            if (matriz[i][j] < 0){
                cont ++
            }

        }
    }
    println("\nDIAGONAL PRINCIPAL: ")
    for (i in 0 until n ){
        print(" "+matriz[i][i] )
    }

    println("\nQUANTIDADE DE NEGATIVOS = $cont")

}