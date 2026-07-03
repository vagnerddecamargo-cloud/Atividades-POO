fun main() {

    val numeros = listOf(10, 25, 8, 42, 15)

    var maior = numeros[0]

    for (numero in numeros) {
        if (numero > maior) {
            maior = numero
        }
    }

    println("Maior valor: $maior")
}