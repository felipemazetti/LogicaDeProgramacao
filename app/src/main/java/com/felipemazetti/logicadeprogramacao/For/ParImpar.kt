package com.felipemazetti.logicadeprogramacao.For

fun main(){

    print("Quantos numeros voce vai digitar? ")
    var n = readln().toInt()

    for (i in 1..n){
        print("Digite um numero: ")
        var x = readln().toInt()

        if (x == 0) {
            println("NULO")

        }else if (x % 2 != 0 ){
            if (x < 0){
                println("IMPAR NEGATIVO")
            }else {
                println("IMPAR POSITIVO")
            }
        }else if(x % 2 == 0){
            if (x < 0){
                println("PAR NEGATIVO")
            }else {
                println("PAR POSITIVO")
            }

        }

    }



}