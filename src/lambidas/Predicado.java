package lambidas;

import java.util.function.Predicate;

public class Predicado {
    public static void main(String[] args) {
        Predicate<Produto> isExpensive = produto -> (produto.preco * (1 - produto.desconto)) >= 750;

        Produto produto = new Produto("Chuca", 49.99, .10);
        System.out.println(isExpensive.test(produto));
    }
}
