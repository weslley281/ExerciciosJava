package fundamentos;

public class TipoString {
    public static void main(String[] args) {
        System.out.println("Oló povo".charAt(0));
        String s = "Boa tarde";
        System.out.println(s.concat(("!!!")));
        System.out.println(s + "!!!");
        System.out.println(s.toUpperCase());
        System.out.println(s.length());
        System.out.println(s.endsWith("tarde"));
        System.out.println(s.equalsIgnoreCase("boa tarde"));
        System.out.println(s.equalsIgnoreCase("boa tarde"));

        String name = "Weslley";
        int age = 27;
        double weight = 73.5;
        System.out.printf("O %s tem %d anos e pesa %.2f", name, age, weight);
    }
}
