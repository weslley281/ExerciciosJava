package generics;

public class CaixaIntText {
    public static void main(String[] args) {
        CaixaInt caixa1 = new CaixaInt();
        caixa1.guardar(1);
        Integer coisa1 = caixa1.abrir();
        System.out.println(coisa1);
    }
}
