class Produto(
    val nome: String,
    var preco: Double,
    var quantidadeEstoque: Int
)

fun main() {

    val produto = Produto(
        "Arroz",
        8.50,
        100
    )

    println("Produto: ${produto.nome} | Preço: R$ %.2f | Estoque: ${produto.quantidadeEstoque}".format(produto.preco))
}