package com.felipemazetti.logicadeprogramacao.Array



fun main(){

    print("Quantas pessoas serao digitadas? ")
    val n = readln().toInt()

    val nome = Array(10){" "}
    val idade = IntArray(10)
    val altura = DoubleArray(10)

    var somaAltura = 0.0
    var contIdade = 0

    var pessoas = mutableListOf<String>()

    for (i in 0 until n-1){
        println("Dados da " + (i+1) +"a pessoa: ")

        print("Nome: ")
        nome[i] = readln()

        print("Idade: ")
        idade[i] = readln().toInt()

        if (idade[i] < 16){
            contIdade += 1
            pessoas.add(nome[i])
        }

        print("Altura: ")
        altura[i] = readln().toDouble()

        somaAltura += altura[i]

    }

    val porcentagemIdade = (contIdade.toDouble() / n.toDouble()) * 100

    val mediaAltura = somaAltura / n

    print("\nAltura média: %.2f ".format(mediaAltura))
    println("\nPorcentagem de pessoas com menos de 16 anos: %.2f%%".format(porcentagemIdade))
    println(pessoas)

    /*for (i in 0 until n-1){
        if (idade[i] < 16){
            println(nome[i])
        }
    }*/

}



