package com.felipemazetti.logicadeprogramacao.While

/*Em um bar, o ingresso custa 10 reais para homens e 8 reais para mulheres. Cada cerveja custa 5
reais, cada refrigerante 3 reais e cada espetinho custa 7. Além disso, o bar cobra uma taxa de
couvert artístico no valor de 4 reais, porém, se o valor gasto com consumo for superior a 30 reais,
o couvert artístico não é cobrado. Fazer um programa para ler os seguintes dados de um cliente do
bar: sexo (F ou M), quantidade de cervejas, refrigerantes e espetinhos consumidos. O programa
deve então mostrar um relatório com a conta a ser paga pelo cliente.*/


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



