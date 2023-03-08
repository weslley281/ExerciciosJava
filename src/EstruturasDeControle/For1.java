package EstruturasDeControle;

import java.util.Scanner;

public class For1 {
    public static void main(String[] args) {
        System.out.print("Digite o numero: ");
        Scanner entrada = new Scanner(System.in);
        double number = entrada.nextInt();

        System.out.println("Soma");

        for (double i = 1; i <= 10; i++){
            System.out.println(number + " + " + i + " = " + (number + i));
        }

        System.out.println("Subtração");

        for (double i = 1; i <= 10; i++){
            System.out.println(number + " - " + i + " = " + (number - i));
        }

        System.out.println("Multiplicação");

        for (double i = 1; i <= 10; i++){
            System.out.println(number + " X " + i + " = " + (number * i));
        }

        System.out.println("Divisão");

        for (double i = 1; i <= 10; i++){
            System.out.println(number + " : " + i + " = " + (number / i));
        }
    }

}
