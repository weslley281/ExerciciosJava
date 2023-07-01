package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
    public static void main(String[] args) {
        HashSet conjunto = new HashSet();

        conjunto.add(1.2);
        conjunto.add(true);
        conjunto.add("Teste");
        conjunto.add(1);
        conjunto.add('a');

        System.out.println("O tamanho é " + conjunto.size());

        conjunto.add("tentativas");

        System.out.println("O tamanho é " + conjunto.size());

        conjunto.remove('a');

        System.out.println("O tamanho é " + conjunto.size());

        System.out.println(conjunto.contains("tentativas"));

        //conjunto.clear();

        //System.out.println("O tamanho é " + conjunto.size());

        Set nums = new HashSet();

        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(conjunto);

        conjunto.addAll(nums);
        //conjunto.retainAll(nums);

        System.out.println(conjunto);
    }
}
