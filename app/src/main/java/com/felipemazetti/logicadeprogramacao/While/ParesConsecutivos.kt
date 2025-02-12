package com.felipemazetti.logicadeprogramacao.While

fun main(){

    print("Digite um numero inteiro: ")
    var valorX = readln().toInt()
    var soma = 0
    var cont = 0

    while (valorX != 0){
        if (valorX % 2 != 0){
            valorX += 1
        }

        while (cont < 5  ){
            soma = soma + valorX
            valorX =  valorX + 2
            cont ++
        }
        println("SOMA: $soma")
        cont =0
        soma = 0

        print("Digite um numero inteiro: ")
        valorX = readln().toInt()

    }




}