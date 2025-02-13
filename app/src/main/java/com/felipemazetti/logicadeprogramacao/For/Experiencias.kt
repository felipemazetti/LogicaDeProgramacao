package com.felipemazetti.logicadeprogramacao.For

fun main(){

    print("Quantos casos de teste serao digitados? ")
    val n = readln().toInt()

    var coelho = 0
    var rato = 0
    var sapo = 0

    for (i in 1..n){
        print("Quantidade de Cobaias: ")
        var qtd = readln().toInt()

        print("Tipo de Cobaia: ")
        var tipo = readln().uppercase()

        if (tipo == "C"){
            coelho +=qtd
        }else if (tipo == "R"){
            rato += qtd
        }else if (tipo == "S"){
            sapo += qtd
        }

    }
    val total = coelho + rato + sapo
    val percentualCoelhos = (coelho.toDouble() / total) * 100
    val percentualRatos = (rato.toDouble() / total) * 100
    val percentualSapos = (sapo.toDouble() / total) * 100
    println("RELATORIO FINAL:")
    println("Total: $total cobais")
    println("Total de coelhos: $coelho")
    println("Total de rato: $rato")
    println("Total de sapos: $sapo")
    println("Percentual de coelhos: %.2f".format(percentualCoelhos))
    println("Percentual de ratos: %.2f".format(percentualRatos))
    println("Percentual de sapos: %.2f".format(percentualSapos))



}