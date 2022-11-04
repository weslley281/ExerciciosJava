package fundamentos;

import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        System.out.print("Digite o grau em Fihrenheit: ");
        Scanner Leitura = new Scanner(System.in);
        final double GraoFihrenheit = Leitura.nextDouble();

        final double GrauCelsius = (GraoFihrenheit - 32) / 1.8;
        System.out.println("Isso em graus Celsius é : " + GrauCelsius);
    }
}
