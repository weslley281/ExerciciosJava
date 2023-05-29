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

        System.out.println("\nCom Lambida 2");
        aprovados.forEach(nome -> meuImprimir(nome));

        System.out.println("\nCom Method Reference 2");
        aprovados.forEach(ForEach::meuImprimir);
    }

    static void meuImprimir(String nome){
        System.out.println("Escrevendo isso aqui " + nome);
    }
}
