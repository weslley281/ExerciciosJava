package generics;

public class CaixaTeste {
    public static void main(String[] args) {
        Caixa<String> caixa1 = new Caixa();
        caixa1.guardar("Segredo");
        System.out.println(caixa1.abrir().toUpperCase());

        Caixa<Double> caixa2 = new Caixa();
        caixa2.guardar(2.600);
        System.out.println(caixa2.abrir());
    }
}
