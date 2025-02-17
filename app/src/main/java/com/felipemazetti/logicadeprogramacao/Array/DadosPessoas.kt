package com.felipemazetti.logicadeprogramacao.Array

fun main (){


    print("Quantas pessoas serão difitadas? ")
    val n = readln().toInt()

    var contM = 0
    var contF = 0

    val alturaVet = DoubleArray(n)
    val generoVet = Array(n){""}
    var maisAlto = alturaVet[0]
    var menosAlto = alturaVet[0]
    var soma = 0.0

    for (i in 0 until n){

        print("Altura da " + (i+1)+ "a pessoa: ")
        alturaVet[i] = readln().toDouble()
        print("Genero da " + (i+1)+ "a pessoa: ")
        generoVet[i] = readln().uppercase()
    }

    for (i in 0 until n){
        if(alturaVet[i] > maisAlto){
            maisAlto = alturaVet[i]
        }
    }


    for (i in 0 until n){
         if (alturaVet[i] < menosAlto){
            menosAlto = alturaVet[i]
        }
    }

    for(i in 0 until n){
        if (generoVet[i] == "F"){
            soma += alturaVet[i]
            contF += 1
        }
    }

    println("\nMenor Altura: %.2f".format(menosAlto))
    println("Maior Altura: %.2f".format(maisAlto))

    if (contF == 0 ){
        println("Impossivel calcular a altura média das mulheres")
    }else{
        val mediaAlturaMulheres = soma / contF
        println("Media das alturas das mulheres = %.2f".format(mediaAlturaMulheres))
    }

    contM = n - contF
    println("Número de homens = $contM")



}