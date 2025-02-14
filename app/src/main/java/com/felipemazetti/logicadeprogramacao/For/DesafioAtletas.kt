package com.felipemazetti.logicadeprogramacao.For

fun main() {

    print("Qual a quantidade de atletas? ")
    val n = readln().toInt()
    var alturaM = 0.0
    var pesoAtletas = 0.0
    var maisAlto = 0.0
    var nomeAlto = ""
    var contH = 0.0
    var contM = 0.0
    var mediaAlturaMulheres = 0.0

    for (i in 1..n) {
        println("Digite os dados do altleta numero $i: ")

        print("Nome: ")
        var nome = readln()
        print("Sexo: ")
        var sexo = readln().uppercase()

        while (sexo != "F" && sexo != "M") {
            print("Valor invalido! Favor digitar F ou M: ")
            sexo = readln().uppercase()
        }

        if (sexo == "M") {
            contH += 1
        } else {
            contM += 1
        }

        print("Altura: ")
        var altura = readln().toDouble()

        while (altura <= 0) {
            print("Valor invalido! Favor digitar um valor positivo: ")
            altura = readln().toDouble()
        }
        if (sexo == "F") {
            alturaM += altura
        }

        if (altura > maisAlto) {
            maisAlto = altura
            nomeAlto = nome
        }

        print("Peso: ")
        var peso = readln().toDouble()
        while (peso <= 0) {
            print("Valor invalido! Favor digitar um valor positivo: ")
            peso = readln().toDouble()
        }
        pesoAtletas += peso

    }

    val mediaPeso = pesoAtletas / n

    val porcentagemH = (contH / n ) * 100


    println("\nRELÁTORIO: ")
    println("Peso médio dos atletas: %.2f".format(mediaPeso))
    println("Atleta mais alto: $nomeAlto ")
    println("porcentagem de homens: %.1f %% ".format(porcentagemH))

    if (contM == 0.0) {
        print("Não há mulheres cadastradas")
    } else {
        mediaAlturaMulheres = alturaM / contM
        print("Altura média das mulheres: %.2f %%".format(mediaAlturaMulheres))

    }


}