package com.felipemazetti.logicadeprogramacao.While

fun main() {

    var gasolina = 0
    var alcool = 0
    var diesel = 0

    print("Informe um codigo (1, 2, 3) ou 4 para parar: ")
    var codigo = readln().toInt()

    while (codigo != 4){
        /*if (codigo == 1){
            alcool ++
        }else if (codigo == 2){
            gasolina ++
        }else if (codigo==3){
            diesel ++
        }*/
        when (codigo) {
            1 -> alcool++
            2 -> gasolina++
            3 -> diesel++
        }
        print("Informe um codigo (1, 2, 3) ou 4 para parar: ")
        codigo = readln().toInt()
    }
    println("\nMuito Obrigado!!!")
    println("Alcool: $alcool")
    println("Gasolina: $gasolina")
    println("Diesel: $diesel")

}