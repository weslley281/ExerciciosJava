package teste.agrupamento;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PDV {
    public static void main(String[] args) {
        Product product1 = new Product("Supositório", 99.99, 10);
        System.out.println("A quantidade é " + product1.quantity);

        product1.sell(2);
        System.out.println("A quantidade é " + product1.quantity);

        List<Product> listProduct = new ArrayList<Product>();
        listProduct.add(product1);
        listProduct.add(new Product("Chuca", 14.99, 13));
        listProduct.add(new Product("Bolas Vaginais", 49.99, 18));
        listProduct.add(new Product("Lubrificante", 9.99, 20));
        listProduct.add(new Product("Camisinha com 3", 14.99, 50));
        listProduct.add(new Product("Esquenta gostoso", 39.99, 5));

        List<Product> listProductExpensive = listProduct.stream().filter(product -> product.price >= 39.99).collect(Collectors.toList());
        List<Product> listProductsheaper = listProduct.stream().filter(product -> product.price < 39.99).collect(Collectors.toList());

        System.out.println("\nProdutos Caros");
        for (Product product: listProductExpensive){
            System.out.println(product.name);
        }

        System.out.println("\nProdutos Baratos");
        for (Product product: listProductsheaper){
            System.out.println(product.name);
        }
    }
}
