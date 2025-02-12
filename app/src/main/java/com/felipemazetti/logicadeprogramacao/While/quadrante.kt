package com.felipemazetti.logicadeprogramacao.While

fun main(){

    println("Digite os valores das coordenadas de X e Y: ")
    var x = readln().toInt()
    var y = readln().toInt()

    while (x != 0 && y != 0){
        if (x > 0 && y < 0){
            println("Quadrante Q4")
        }else if (x > 0 && y >0){
            println("Quadrante Q1")
        }else if (x < 0 && y > 0){
            println("Quadrante Q2")
        }else if (x < 0 && y < 0){
            println("Quadrante Q3")
        }

        println("Digite os valores das coordenadas de X e Y: ")
        x = readln().toInt()
        y = readln().toInt()

    }


}