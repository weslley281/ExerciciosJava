package classes;



public class ProdutoTeste {
    public static void main(String[] args) {
        Produto p1 = new Produto("Chuca", 49.99);

        var p2 = new Produto();
        p2.nome = "Supositório";
        p2.preco = 79.99;
        p2.desconto = 0.20;

        System.out.println(p1.nome + " " + p1.precoComDesconto());
        System.out.println(p2.nome + " " + p2.precoComDesconto());

        double precoFinal1 = p1.precoComDesconto();
        double precoFinal2 = p2.precoComDesconto();
        double media = (precoFinal1 + precoFinal2) / 2;

        System.out.println(precoFinal1);
        System.out.println(precoFinal2);
        System.out.printf("A média do carrinho é = R$%.2f.", media);
    }
}
