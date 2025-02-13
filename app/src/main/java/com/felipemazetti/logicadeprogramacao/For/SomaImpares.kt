package com.felipemazetti.logicadeprogramacao.For

fun main(){

    println("Digite dois números: ")
    var x = readln().toInt()
    var y = readln().toInt()
    var soma = 0
    var troca = 0

    if (x > y){
        troca = x
        x = y
        y = troca
    }


    for (i in x+1.. y-1){
        if (i % 2 != 0 ){
            soma +=i
        }
    }
    print("SOMA: $soma")

}