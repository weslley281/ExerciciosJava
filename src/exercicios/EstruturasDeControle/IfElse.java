package EstruturasDeControle;

import javax.swing.*;

public class IfElse {
    public static void main(String[] args) {
        String valor = JOptionPane.showInputDialog("Informe o número");
        int number = Integer.parseInt(valor);

        if(number % 2 == 0) System.out.println("Numero par");
        else System.out.println("Número Impar");
    }
}
