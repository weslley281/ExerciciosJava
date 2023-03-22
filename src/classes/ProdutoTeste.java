package classes;



public class ProdutoTeste {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.nome = "Chuca";
        p1.preco = 49.99;
        p1.desconto = 0.15;

        var p2 = new Produto();
        p2.nome = "Supositório";
        p2.preco = 79.99;
        p2.desconto = 0.20;

        System.out.println(p1.nome);
        System.out.println(p2.nome);
    }
}
