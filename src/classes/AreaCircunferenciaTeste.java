package classes;

public class AreaCircunferenciaTeste {
    public static void main(String[] args) {
        AreaCircunferencia a = new AreaCircunferencia(5.6);
        System.out.println(a.area());

        AreaCircunferencia b = new AreaCircunferencia(20);
        System.out.println(b.area());
    }
}
