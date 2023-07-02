package lambidas;

public class CalculoTeste2 {
    public static void main(String[] args) {
        Calculo soma = (a, b) -> a + b;
        Calculo multiplicacao = (a, b) -> a * b;

        System.out.println("O resultado da soma é: " + soma.executar(4,6));
        System.out.println("O resultado da multiplicação é: " + multiplicacao.executar(5,8));
    }
}
