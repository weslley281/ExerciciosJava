package generics;

public class CaixaObjetoTeste {
    public static void main(String[] args) {
        CaixaObjeto caixa1 = new CaixaObjeto();
        caixa1.aguardar(2.3);

        Double coisa1 = (Double) caixa1.abrir();
        System.out.println(coisa1);

        CaixaObjeto caixa2 = new CaixaObjeto();
        caixa2.aguardar("Olá");

        String coisa2 = (String) caixa2.abrir();
        System.out.println(coisa2);
    }
}
