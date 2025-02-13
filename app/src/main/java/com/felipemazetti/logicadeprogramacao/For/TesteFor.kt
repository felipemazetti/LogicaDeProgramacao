package com.felipemazetti.logicadeprogramacao.For

fun main() {

    print("Quantos números serão digitado: ")
    var num = readln().toInt()
    var soma = 0

    for ( i in 1 ..num){
        print("Digite um número:  ")
        num = readln().toInt()
        soma += num

    }
    print("SOMA: $soma")



}