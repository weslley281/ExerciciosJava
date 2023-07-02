package lambidas;

public class CalculoTeste1 {
    public static void main(String[] args) {
        Calculo soma = new Somar();
        Calculo multiplicacao = new Multiplicar();

        System.out.println("--------------------Somas--------------------");
        System.out.println(soma.executar(2,3));
        System.out.println(soma.executar(8,3));

        System.out.println("--------------------Multiplicação--------------------");
        System.out.println(multiplicacao.executar(5,8));
    }
}
