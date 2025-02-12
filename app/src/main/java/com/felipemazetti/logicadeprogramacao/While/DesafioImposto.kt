package com.felipemazetti.logicadeprogramacao.While

fun main (){

    print("Renda anual com salário: ")
    val rendaSalário = readln().toDouble()

    print("Renda anual com prestação de serviço: ")
    val rendaPServico = readln().toDouble()

    print("Remda anual com ganho de capital: ")
    val rendaCapital = readln().toDouble()

    print("Gastos Médicos: ")
    val gastosMedicos = readln().toDouble()

    print("Gastos Educacionais: ")
    val gastosEducacionais = readln().toDouble()


    val rendaMensal = rendaSalário / 12

    val impostoSobreSalario = if (rendaMensal <= 3000.00 ){
         0.00
    }else if (rendaMensal < 5000.00){
        (rendaSalário * 10) / 100
    }else{
        (rendaSalário * 20) / 100
    }
    val impostoPrestacaoServico = if (rendaPServico != 0.00){
         (rendaPServico * 15) / 100
    } else{
        0.00
    }

    val impostoGanhoCapital = if (rendaCapital != 0.00){
        (rendaCapital * 20) / 100
    }else{
        0.00
    }

    val deducao = (impostoSobreSalario + impostoPrestacaoServico + impostoGanhoCapital ) * 30 / 100

    val gastosDedutiveis = gastosMedicos + gastosEducacionais

    val calculo = if (gastosDedutiveis < deducao){
        gastosDedutiveis
    }else {
        deducao
    }
    val impostoTotal = impostoSobreSalario + impostoPrestacaoServico + impostoGanhoCapital

    val impostoDevido = impostoTotal - calculo

    println("\n----------RELATÓRIO IMPOSTO DE RENDA----------\n")
    println("CONSOLIDADO DE RENDA")
    println("Imposto sobre salário: R$%.2f".format(impostoSobreSalario))
    println("Imposto sobre serviços: R$%.2f".format(impostoPrestacaoServico))
    println("Imposto sobre ganho de capital: R$%.2f".format(impostoGanhoCapital))

    println("\nDEDUÇÕES")
    println("Máximo dedutível: R$%.2f".format(deducao))
    println("Gastos dedutíveis: R$%.2f".format(gastosDedutiveis))

    println("\nRESUMO: ")
    println("Imposto bruto total: R$%.2f".format(impostoTotal))
    println("Abatimento: R$%.2f".format(calculo))
    println("Imposto devido: R$%.2f".format(impostoDevido))








}