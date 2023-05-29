package lambidas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
    public static void main(String[] args) {
        Consumer<Produto> imprimir = produto -> System.out.println("Nome: " + produto.nome + "\nPreço: R$ " + (produto.preco * produto.desconto));

        Produto produto1 = new Produto("Caneta", 1.99, 0.9);
        imprimir.accept(produto1);

        Produto produto2 = new Produto("Lapis", 1.99, 0.9);
        Produto produto3 = new Produto("Caderno", 19.99, 0.9);
        Produto produto4 = new Produto("Borracha", 0.99, 0.9);

        List<Produto> produtos = Arrays.asList(produto1, produto2, produto3, produto4);

        produtos.forEach(imprimir);
        produtos.forEach(produto -> System.out.println(produto.preco));
        produtos.forEach(System.out::println);
    }
}
