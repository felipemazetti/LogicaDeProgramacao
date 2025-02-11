package com.felipemazetti.logicadeprogramacao

/*Problema "crescente" (adaptado de URI 1113)
Leia uma quantidade indeterminada de duplas de valores inteiros X e Y. Escreva para cada X e Y uma
mensagem que indique se estes valores foram digitados em ordem crescente ou decrescente. O
programa deve finalizar quando forem digitados dois valores iguais.*/


fun main(){

    println("Digite dois numeros: ")
    var x = readln().toInt()
    var y = readln().toInt()

    while (x != y){

        if (x > y){
            print("DECRESCENTE")
        }else {
            println("CRESCENTE")
        }

        print("\nDigite outros dois numeros: ")
        x = readln().toInt()
        y = readln().toInt()


    }



}