package generics;

public class ParesTeste {
    public static void main(String[] args) {
        Pares<Integer, String> resultadoConcurso = new Pares<>();

        resultadoConcurso.adcionar(1, "Fulano");
        resultadoConcurso.adcionar(2, "Cicrano");
        resultadoConcurso.adcionar(3, "Deltrano");
        resultadoConcurso.adcionar(4, "Maltrano");
        resultadoConcurso.adcionar(5, "Heltrano");

        System.out.println(resultadoConcurso.getValor(1).toString());
    }

}
