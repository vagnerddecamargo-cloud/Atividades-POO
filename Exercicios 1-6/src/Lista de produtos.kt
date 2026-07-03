fun main() {

    val produtos = listOf(
        Produto("Arroz", 8.50, 100),
        Produto("Feijão", 9.80, 50),
        Produto("Macarrão", 5.20, 80)
    )

    for (produto in produtos) {
        println("Produto: ${produto.nome} | Preço: R$ ${produto.preco} | Estoque: ${produto.quantidadeEstoque}")
    }
}