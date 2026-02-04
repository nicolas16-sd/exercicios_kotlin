fun positivoNegativoOuZero(){
    val numero = 22

    if (numero > 0){
        println("O número $numero é posiitvo")
    } else if (numero < 0){
        println("O número $numero é negativo")
    } else if (numero == 0){
        println("O número é 0")
    } else {
        println("Variável inválida!")
    }
}