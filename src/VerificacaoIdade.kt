fun verificacaoIdade(){
    val idade = 18

    when(idade){
        in 0..11 -> println("Criança")
        in 12..17 -> println("Adolescente")
        in 18..59 -> println("Adulto")
        in 59..120 -> println("Idoso")
    }
}