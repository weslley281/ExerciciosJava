package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Ferrari;
import oo.heranca.desafio.Fusca;

public class CarroTeste {
    public static void main(String[] args) {
        System.out.println("\n--------------------Fusca--------------------\n");

        Carro carro1 = new Fusca();

        carro1.acelerar();
        System.out.println("Fusca " + carro1);

        carro1.acelerar();
        System.out.println("Fusca " + carro1);

        carro1.acelerar();
        System.out.println("Fusca " + carro1);

        carro1.acelerar();
        System.out.println("Fusca " + carro1);

        System.out.println("\n--------------------Ferrari--------------------\n");

        Ferrari carro2 = new Ferrari(400);

        carro2.acelerar();
        System.out.println("Ferrari " + carro2);

        carro2.acelerar();
        System.out.println("Ferrari " + carro2);

        carro2.ligarTurbo();

        carro2.acelerar();
        System.out.println("Ferrari " + carro2);

        carro2.acelerar();
        System.out.println("Ferrari " + carro2);
    }
}
