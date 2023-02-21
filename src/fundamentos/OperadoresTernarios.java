package fundamentos;

public class OperadoresTernarios {
    public static void main(String[] args) {
        double media = 6;
        String resultado = media >= 7.0 ? "Aprovado" :( media >= 5 ? "Recuperacao" : "Reprovado");

        System.out.println(resultado);
    }
}
