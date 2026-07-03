fun main() {

    val precos = listOf(17.0, 28.5, 19.0)

    var total = 0.0

    for (preco in precos) {
        total += preco
    }

    if (total > 50.0) {
        total *= 0.90
    }

    println("Total da compra: R$ %.2f".format(total))
}