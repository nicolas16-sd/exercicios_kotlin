fun somaArray(){
    val numeros = arrayOf(1, 2, 3, 4)
    var soma = 0

    for (numero in numeros){
        soma += numero
    }

    println("Soma total: $soma")
}