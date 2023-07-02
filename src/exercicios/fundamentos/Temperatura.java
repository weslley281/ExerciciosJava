package fundamentos;

import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        final double GraoFihrenheit;
        final double GrauCelsius;

        System.out.print("Digite o grau em Fihrenheit: ");
        Scanner Leitura = new Scanner(System.in);
        GraoFihrenheit = Leitura.nextDouble();

        GrauCelsius = (GraoFihrenheit - 32) / 1.8;
        System.out.println("Isso em graus Celsius é : " + GrauCelsius);
    }
}
