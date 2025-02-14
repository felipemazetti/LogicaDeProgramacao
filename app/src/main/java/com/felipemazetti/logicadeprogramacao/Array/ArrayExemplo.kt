package com.felipemazetti.logicadeprogramacao.Array

fun main() {
    print("Quantos números você vai ler (N)? ")
    val n = readln().toInt()

    val vet = FloatArray(10) // Declara o vetor de reais com tamanho 10

    for (i in 0 until n) {
        print("Digite um número: ")
        vet[i] = readln().toFloat()
    }

    println()
    println("NÚMEROS DIGITADOS:")

    for (i in 0 until n) {
        println(vet[i])
    }
}