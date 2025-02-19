package com.felipemazetti.logicadeprogramacao.Array

// array: Nome :String, Nota1 : Double, Nota2 : Double


fun main() {

    print("Qual a quantidade de pessoas: ")
    val n = readln().toInt()

    val nomes = Array(n) { "" }
    val notaPrimeiraEtapa = DoubleArray(n)
    val notaSegundaEtapa = DoubleArray(n)
    var media= DoubleArray(n)

    var somaMedia = 0.0
    var contAprovados = 0
    var maiorMedia = 0.0
    var nomeMaiorMedia = ""

    for (i in 0 until n) {
        println("Digite os dados da " + (i + 1) + "a pessoa: ")
        print("Nome: ")
        nomes[i] = readln().trim()
        print("Nota primeira etapa: ")
        notaPrimeiraEtapa[i] = readln().toDouble()
        print("Nota segunda etapa: ")
        notaSegundaEtapa[i] = readln().toDouble()

        media[i] = (notaPrimeiraEtapa[i] + notaSegundaEtapa[i]) / 2

        if (media[i] > maiorMedia) {
            maiorMedia = media[i]
            nomeMaiorMedia = nomes[i]
        }

    }

    println("\nTABLEA DE PESSOAS: ")
    for (i in 0 until n) {
        println(nomes[i] + ", " + notaPrimeiraEtapa[i] + ", " + notaSegundaEtapa[i] + ", " + "MÉDIA = " + media[i])

    }

    println("\nPESSOAS APROVADAS: ")
    for (i in 0 until n) {
        if (media[i] >= 70) {
            somaMedia += media[i]
            contAprovados++
            println(nomes[i])
        }


    }

    val porcentagemAprovacao = (contAprovados.toDouble() / n.toDouble()) * 100
    val mediaAprovados = somaMedia / contAprovados


    println("\nPorcentagem de aprovação: $porcentagemAprovacao %")
    println("Maior média: $nomeMaiorMedia")
    if (contAprovados != 0) {
        println("Nota média dos Aprovados: %.2f ".format(mediaAprovados))
    } else {
        println("Não há candidatos aprovados")
    }

}