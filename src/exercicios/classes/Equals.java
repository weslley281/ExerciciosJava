package classes;

public class Equals {
    public static void main(String[] args) {
        Usuario u1 = new Usuario();
        u1.nome = "Weslley Ferraz";
        u1.email = "weslleyhenrique800@gmail.com";

        Usuario u2 = new Usuario();
        u2.nome = "Weslley Ferraz";
        u2.email = "weslleyhenrique800@gmail.com";

        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));

        System.out.println();
    }
}
