package oo.composicao;

public class CompraTeste {
    public static void main(String[] args) {
        Compra compra1 = new Compra();
        compra1.cliente = "Fulano de Tal";
        compra1.adcionarItem("Caneta Preta", 10, 1.5);
        compra1.adcionarItem("Borracha", 40, 0.8);
        compra1.adcionarItem("Caderno", 12, 11.99);

        System.out.println("Quantidade de item é " + compra1.itens.size());
        System.out.println("Valor total da compra é " + compra1.obterValorTotal());
    }
}
