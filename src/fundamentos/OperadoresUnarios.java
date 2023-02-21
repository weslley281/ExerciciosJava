package fundamentos;

public class OperadoresUnarios {
    public static void main(String[] args) {
        int a = 3;
        int b = 3;

        a++;
        b--;

        --a;
        ++b;

        System.out.println("O valor de a = " + a);
        System.out.println("O valor de b = " + b);

        System.out.println("O valores são iguais? " + ((++a == b--) ? "Sim." : "Não.") );

        System.out.println("O valor de a = " + a);
        System.out.println("O valor de b = " + b);
    }
}
