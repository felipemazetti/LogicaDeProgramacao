package com.felipemazetti.logicadeprogramacao.Array

fun main(){

    print("Serão digitados dados de quantos produtos? ")
    val n = readln().toInt()

    val nomeProdutoVet = Array(n){""}
    val precoCompraVet = DoubleArray(n)
    val precoVendaVet = DoubleArray(n)

    var contDez = 0
    var contDezAVinte = 0
    var contAcimaVinte = 0
    var somaCompra = 0.0
    var somaVenda = 0.0


    for (i in 0 until n){
        println("Produto "+ (i+1)+":")
        print("Nome: ")
        nomeProdutoVet[i] = readln()
        print("Preço de compra: ")
        precoCompraVet[i] = readln().toDouble()
        print("Preço de venda: ")
        precoVendaVet[i] = readln().toDouble()

        somaCompra += precoCompraVet[i]
        somaVenda += precoVendaVet[i]

        val lucro = (precoVendaVet[i] - precoCompraVet[i])
        val porcentagemLucro = (lucro / precoCompraVet[i]) * 100

        when {
            porcentagemLucro < 10.00 -> contDez++
            porcentagemLucro <= 20.00 -> contDezAVinte++
            else -> contAcimaVinte ++
        }


    }

    println("\nRELATÓRIO: ")
    println("Lucro abaixo de 10%%: $contDez")
    println("Lucro entre 10%% e 20%%: $contDezAVinte")
    println("Lucro acima de 20%%: $contAcimaVinte")
    println("Valor total de compra: R$ %.2f".format(somaCompra))
    println("Valor total de venda: R$ %.2f".format(somaVenda))
    println("Lucro total: R$ %.2f".format(somaVenda - somaCompra))
}