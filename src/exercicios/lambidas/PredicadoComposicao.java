package lambidas;

import java.util.function.Predicate;

public class PredicadoComposicao {
    public static void main(String[] args) {
        Predicate<Integer> ePar = num -> num % 2 == 0;
        Predicate<Integer> eTresDigito = num -> num > 100 && num <= 999;

        System.out.println(ePar.and(eTresDigito).test(122));
        System.out.println(ePar.or(eTresDigito).test(123));
    }
}
