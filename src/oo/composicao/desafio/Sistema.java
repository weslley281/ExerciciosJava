package oo.composicao.desafio;

public class Sistema {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Fulano de Tal");
        Compra compra1 = new Compra();
        compra1.adcionarItem("Caneta Preta", 1.5, 5);
        compra1.adcionarItem(new Produto("Notebook", 5069.98), 1);

        Compra compra2 = new Compra();
        compra2.adcionarItem("Caderno", 9.99, 8);
        compra2.adcionarItem(new Produto("Impresso", 999.98), 1);

        cliente.compras.add(compra1);
        cliente.compras.add(compra2);

        System.out.println(cliente.obterValorTotal());
    }
}
