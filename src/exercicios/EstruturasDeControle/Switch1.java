package EstruturasDeControle;

import java.util.Scanner;

public class Switch1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Qual a sua graduação: ");
        String faixa = entrada.nextLine();

        System.out.println("Você tem que aprender...");
        switch (faixa.toLowerCase()){
            case "preta":
                System.out.println("Mais");
            case "marron":
                System.out.println("Jitte");
            case "roxa":
                System.out.println("Bassai-Dai");
            case "verde":
                System.out.println("Tekki Shodan");
            case "laranja":
                System.out.println("Heian Godan");
            case "vermelha":
                System.out.println("Heian Sandan");
            case "amarela":
                System.out.println("Heian Nidan");
            case "branca":
                System.out.println("Heian Shodan");

        }
    }
}
