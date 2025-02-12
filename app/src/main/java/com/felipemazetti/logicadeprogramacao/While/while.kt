package com.felipemazetti.logicadeprogramacao.While

fun main(){

    print("Digite o primeiro numero: ")
    var x = readln().toInt()
    var soma = 0

    while ( x != 0 ){
        soma += x
        print("Digite outro numero: ")
        x = readln().toInt()

    }
    print("Soma: $soma")









}