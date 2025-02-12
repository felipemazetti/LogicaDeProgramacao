package com.felipemazetti.logicadeprogramacao.While

fun main (){


    print("Digite a senha: ")
    var senha = readln().toInt()

    while (senha != 2002){
        print("Senha Inválida! Tente novamente: ")
        senha = readln().toInt()

    }

    println("Acesso permitido!")




}