package com.felipemazetti.logicadeprogramacao.While

fun main(){

    print("Digite a primeira nota: ")
    var primeiraNota = readln().toDouble()

    while (primeiraNota <0 || primeiraNota >10){
        print("Valor inválido! Tente Novamente: ")
        primeiraNota = readln().toDouble()
    }

    print("Digite a segunda nota: ")
    var segundaNota = readln().toDouble()

    while (segundaNota <0 || segundaNota >10){
        print("Valor inválido! Tente Novamente: ")
        segundaNota = readln().toDouble()
    }

    var media = (primeiraNota + segundaNota) /2
    print("MÉDIA: $media")


}