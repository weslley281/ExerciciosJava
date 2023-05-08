package oo.heranca.desafio;

public class CarroTeste {
    public static void main(String[] args) {
        Carro carro1 = new Fusca();

        carro1.acelerar();
        System.out.println("Fusca " + carro1);

        carro1.acelerar();
        System.out.println("Fusca " + carro1);

        carro1.acelerar();
        System.out.println("Fusca " + carro1);

        carro1.acelerar();
        System.out.println("Fusca " + carro1);

        Ferrari carro2 = new Ferrari(400);

        carro2.acelerar();
        System.out.println("Ferrari " + carro2);

        carro2.acelerar();
        System.out.println("Ferrari " + carro2);

        carro2.acelerar();
        System.out.println("Ferrari " + carro2);
    }
}
