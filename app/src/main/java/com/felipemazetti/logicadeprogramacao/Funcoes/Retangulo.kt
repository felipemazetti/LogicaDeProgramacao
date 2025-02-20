package com.felipemazetti.logicadeprogramacao.Funcoes

import kotlin.math.pow
import kotlin.math.sqrt

fun main(){

    print("Digite o valor da base do retangulo: ")
    val base = readln().toDouble()
    print("Digite o valor da altura do retangulo: ")
    val altura = readln().toDouble()

    calculoDiagonal(base, altura)
    calculoArea(base, altura)
    calculoPerimetro (base, altura)



}

fun calculoPerimetro(base: Double, altura: Double): Unit {
    val p = 2 * (base + altura)
    println("Perimetro: %.2f".format(p))
}

fun calculoArea(base: Double, altura: Double): Unit {
    val a = base * altura
    println("Area: %.2f".format(a))
}

fun calculoDiagonal(base: Double, altura: Double): Unit {
    val d = sqrt(base.pow(2) + altura.pow(2))
    println("Diagonal: %.2f".format(d))
}
