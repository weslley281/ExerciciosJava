package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
    public static void main(String[] args) {
        //Set<String> lista = new HashSet<>();
        SortedSet<String> lista = new TreeSet<>();

        lista.add("Fulano");
        lista.add("Cicrano");
        lista.add("Deltrano");
        lista.add("Maltrano");

        for (String candidato: lista) {
            System.out.println(candidato);
        }

        Set<Integer> nums = new HashSet<>();

        nums.add(1);
        nums.add(32);
        nums.add(48);
        nums.add(120);

        for (int n: nums) {
            System.out.println(n);
        }
    }
}
