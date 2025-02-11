package com.felipemazetti.logicadeprogramacao


fun main () {

    print("Sexo: ")
    val sexo = readln().uppercase()

    if (sexo != "F" && sexo != "M"){
        println( "Digite um valor válido (F/M)")
    }else {

        print("Quantidade de Cerveja: ")
        val cerveja = readln().toInt()

        print("Quantidade de refrigerante: ")
        val refri = readln().toInt()

        print("Quantidade de espetinhos: ")
        val espetinhos = readln().toInt()

        val qntCerveja = cerveja * 5.00
        val qntRefri = refri * 3.00
        val qntEspetinho = espetinhos * 7.00

        val consumo = qntCerveja + qntRefri + qntEspetinho



        val ingresso = if (sexo == "F") {
            8.00
        } else {
            10.00
        }
        val couvert = if (consumo > 30.00) {
            0.00
        } else {
            4.00
        }

        val total = consumo + couvert + ingresso
        println("\nRELATÓRIO: ")
        println("Consumo: R$%.2f".format(consumo))
        println("Couvert: R$ %.2f".format(couvert))
        println("Ingresso: R$%.2f".format(ingresso))
        println("\nValor a pagar: R$%.2f".format(total))
        }
    }



