class Produto(
    val nome: String,
    precoInicial: Double,
    var quantidadeEstoque: Int
) {
    private var preco = precoInicial

    fun getPreco(): Double {
        return preco
    }

    fun setPreco(valor: Double) {
        if (valor >= 0) {
            preco = valor
        } else {
            println("Erro: preço não pode ser negativo.")
        }
    }
}

fun main() {

    val produto = Produto("Arroz", 16.99, 100)

    produto.setPreco(-10.0)
    produto.setPreco(12.90)

    println("Preço final: R$ ${produto.getPreco()}")
}