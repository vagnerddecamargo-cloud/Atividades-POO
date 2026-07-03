Exercicio 01 - Par ou Impar

fun main() {
        val numero = 15

        if (numero % 2 == 0) {
            println("$numero é par")
        } else {
            println("$numero é ímpar")
        }
    }



Exercicio 2 - Maior Valor

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



Exercicio 3 - Soma Com Condição.

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


Exercicio 4 - Total Da Compra.

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



Exercicio 5 - Classe produto.

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



Exercicio 6 - Lista de Produtos.

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



Exercicios 7 - Refatorado.

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

