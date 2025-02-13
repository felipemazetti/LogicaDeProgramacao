package com.felipemazetti.logicadeprogramacao.For

fun main (){

    print("Quantos numeros voce vai digitar? ")
    var n = readln().toInt()
    var somaDentro = 0
    var somaFora = 0


    for(i in 1..n){
        println("Digite um número: ")
        var x = readln().toInt()
        if (x in 10..20){
            somaDentro +=1
        }else{
            somaFora +=1
        }
    }

    println("$somaDentro DENTRO")
    println("$somaFora FORA")




}