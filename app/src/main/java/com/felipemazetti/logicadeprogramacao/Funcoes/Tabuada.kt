package com.felipemazetti.logicadeprogramacao.Funcoes

fun main (){

    print("Você quer a tabuada de qual número? ")
    val n = readln().toInt()

    mostrarTabuada(n)



}

fun mostrarTabuada(n: Int) {

    for (i in 1 until 11){
        val resultado = i * n
        println("$n x $i = $resultado")
    }

}
