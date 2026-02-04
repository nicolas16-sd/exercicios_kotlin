fun somaParesArray() {
    val numeros = arrayOf(1, 2, 3, 4)
    var soma = 0

    for (numero in numeros){
        if (numero % 2 == 0){
            soma += numero
        }
    }

    println("Soma dos números pares: $soma")
}