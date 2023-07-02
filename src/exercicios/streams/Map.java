package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {
    public static void main(String[] args) {
        Consumer<String> print = System.out::println;

        List<String> marcas = Arrays.asList("BMW", "Audit", "Honda");
        marcas.stream().map(m -> m.toLowerCase());

        marcas.stream().map(Utilitarios.maiuscula).map(Utilitarios.primeiraLetra).forEach(print);
    }
}
