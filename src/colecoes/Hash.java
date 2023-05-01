package colecoes;

import java.util.HashSet;

public class Hash {
    public static void main(String[] args) {
        HashSet<Usuario> usuarios = new HashSet<Usuario>();

        usuarios.add(new Usuario("Fulano"));
        usuarios.add(new Usuario("Cicrano"));
        usuarios.add(new Usuario("Deltrano"));

        boolean resultado = usuarios.contains(new Usuario("Deltrano"));
        System.out.println(resultado);
    }
}
