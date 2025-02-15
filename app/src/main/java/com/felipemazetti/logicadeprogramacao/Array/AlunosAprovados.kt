package com.felipemazetti.logicadeprogramacao.Array

fun main() {

    print("Quantos alunos serão digitados? ")
    val n = readln().toInt()

    val vetNome = Array(n){""}
    val vetPrimeiraNota = DoubleArray(n)
    val vetSegundaNota = DoubleArray(n)


    for (i in 0 until n){
        println("Digite nome, primeira e segunda nota do " +(i+1)+ "o aluno: ")
        vetNome[i] = readln()
        vetPrimeiraNota[i] = readln().toDouble()
        vetSegundaNota[i] = readln().toDouble()
    }

    println("\nAlunos aprovados: ")
    for (i in 0 until n){
        val resultado = (vetPrimeiraNota[i] + vetSegundaNota[i]) / 2

        if (resultado >= 6.0){
            println(vetNome[i])
        }

    }



}