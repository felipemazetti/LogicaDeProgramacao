package com.felipemazetti.logicadeprogramacao.While

fun main(){

    print("Digite as idades: ")
    var idade = readln().toInt()
    var soma = 0.0
    var cont = 0



   while ( idade >= 0){
       soma += idade
       cont ++
       idade = readln().toInt()

   }

   if (cont == 0){
       println("IMPOSSIVEL CALCULAR")
   }else {
       val resultado = soma / cont
       println("MEDIA: %.2f".format(resultado))
   }


}