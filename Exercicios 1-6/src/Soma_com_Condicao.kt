fun main() {

    val numeros = listOf(5, 19, 41, 7, 44, 2)

    var soma = 0

    for (numero in numeros) {
        if (numero > 10) {
            soma += numero
        }
    }

    println("Soma dos números maiores que 10: $soma")
}