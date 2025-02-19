package com.felipemazetti.logicadeprogramacao.Matriz

fun main() {

    print("Informe a quantidade de clientes: ")
    val n = readln().toInt()

    val nome = Array(n) { " " }
    val telefone = Array(n) { " " }
    val tipo = IntArray(n)
    val minutos = IntArray(n)

    val mat = Array(3) { Array(3) { 0.0 } }


    for (i in 0 until n) {
        println("Dados do " + (i + 1) + "o. cliente: ")
        print("Nome: ")
        nome[i] = readln()

        print("Telefone: ")
        telefone[i] = readln()

        print("Tipo: ")
        tipo[i] = readln().toInt()

        print("Minutos: ")
        minutos[i] = readln().toInt()

        println("")
    }

    println("\nInforme o preço básico e excedente de cada tipo de conta: ")
    for (i in 0 until 3) {
        println("Tipo $i: ")
        for (j in 0 until 2) {
            mat[i][j] = readln().toDouble()
        }
    }



    println("\nRELATÓRIO DOS CLIENTES: ")

    for (i in 0 until n) {
        val precoBasico = mat[tipo[i]][0]
        val precoExcedente = mat[tipo[i]][1]
        var valorConta = 0.0

        if (minutos[i] > 90) {
            val minutosExcedente = minutos[i] - 90
            val custoExcedente = minutosExcedente * precoExcedente
            valorConta = precoBasico + custoExcedente
        } else {
            valorConta = precoBasico
        }

        println("${nome[i]} | ${telefone[i]} | Tipo ${tipo[i]} | Minutos: ${minutos[i]} | Conta: R$ ${"%.2f".format(valorConta)}")

    }

}