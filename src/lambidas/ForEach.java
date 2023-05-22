package lambidas;

import java.util.Arrays;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList("Fulano", "Cicrano", "Deltrano");

        System.out.println("Forma Trdicional...");
        for (String nome: aprovados){
            System.out.println(nome);
        }

        System.out.println("\nCom Lambida");
        aprovados.forEach(nome -> System.out.println(nome + "!"));

        System.out.println("\nCom Method Reference");
        aprovados.forEach(System.out::println);
    }
}
