package fundamentos;

import javax.swing.*;

public class ConversaoStringNumero {
    public static void main(String[] args) {
        String valor1 = JOptionPane.showInputDialog("Digite o primeiro número");
        String valor2 = JOptionPane.showInputDialog("Digite o segundo número");

        double  num1 = Double.parseDouble(valor1);
        double  num2 = Double.parseDouble(valor2);
        double resultado = num1 + num2;
        double media = resultado / 2;

        System.out.println("O resultado da soma é " + resultado);
        System.out.println("A média é " + media);
    }
}
