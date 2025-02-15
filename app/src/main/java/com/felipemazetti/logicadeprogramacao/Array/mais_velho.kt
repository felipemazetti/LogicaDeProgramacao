package com.felipemazetti.logicadeprogramacao.Array

fun main (){

    print("Quantas pessoas voce vai digitar? ")
    val n = readln().toInt()

    val vetNome = Array(n){" "}
    val vetIdade = IntArray(n)

    var maisVelho = 0
    var nome = ""

    for (i in 0 until n){
        println("Dados da " + (i+1) +"a pessoa: ")
        print("Nome: ")
        vetNome[i] = readln()
        print("Idade: ")
        vetIdade[i] = readln().toInt()
    }

    for (i in 0 until n){
        if (vetIdade[i] > maisVelho){
            maisVelho = vetIdade[i]
            nome = vetNome[i]
        }

    }

    println("\nPESSOA MAIS VELHA: $nome")

}