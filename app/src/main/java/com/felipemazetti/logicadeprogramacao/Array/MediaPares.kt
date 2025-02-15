package com.felipemazetti.logicadeprogramacao.Array

fun main() {

    print("Quantos elementos vai ter o vetor? ")
    val n = readln().toInt()

    val vetor = IntArray(n)
    var soma = 0.0
    var cont = 0.0

    for (i in 0 until n) {
        print("Digite um numero: ")
        vetor[i] = readln().toInt()
    }

    for (i in 0 until n) {
        if (vetor[i] % 2 == 0) {
            soma += vetor[i]
            cont += 1
        }
    }



    if (cont > 0) {
        val media = soma / cont
        print("MEDIA DOS NUMEROS PARES: %.1f".format(media))
    } else {
        print("NENHUM NUMERO PAR")
    }


}