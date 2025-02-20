package com.felipemazetti.logicadeprogramacao.Funcoes

fun main (){

    print("Nome: ")
    val nome = readln()
    print("Valor total: ")
    val valorTotal = readln().toDouble()
    print("Valor de entrada: ")
    val valorEntrada = readln().toDouble()

    mostrarRelatorio(nome, valorTotal, valorEntrada)

}

fun mostrarRelatorio (nome: String, total: Double, entrada : Double) : Unit{
    val restante = total - entrada

    println("RELATORIO: ")
    println("Nome: $nome")
    println("Valor Total: $total")
    println("Valor Entrada: $entrada")
    println("Valor Parcelado: $restante")


}