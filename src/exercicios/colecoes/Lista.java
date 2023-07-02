package colecoes;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {
        ArrayList<Usuario> lista = new ArrayList<>();

        Usuario u1 = new Usuario("Fulano");
        lista.add(u1);
        lista.add(new Usuario("Cicrano"));
        lista.add(new Usuario("Deltrano"));
        lista.add(new Usuario("Maltrano"));

        System.out.println(lista.get(3));
        System.out.println(lista.contains(new Usuario("Maltrano")));
        lista.remove(1);

        for (Usuario u: lista){
            System.out.println(u.nome);
        }
    }
}
