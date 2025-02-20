package com.felipemazetti.logicadeprogramacao.Funcoes

fun main(){

    print("Digite o valor do salario bruto: ")
    val quantia = readln().toDouble()
    println("Salário Liquido: %.2f".format(salarioLiquido(quantia)))




}
fun imposto(quantia: Double): Double{
    var calculo = 0.0
    if (quantia <= 4000.00){
       calculo = (quantia / 100) * 20
    }else {
        calculo = (quantia / 100) * 25
    }
    return calculo
}
fun previdencia(quantia: Double): Double{
    var calculo = 0.0

    if (quantia <= 1500){
        calculo = (quantia / 100) * 10
    }else{
        calculo = (quantia / 100) * 15
    }
    return calculo
}
fun salarioLiquido(quantia: Double): Double{
    return quantia - previdencia(quantia) - imposto(quantia)
}