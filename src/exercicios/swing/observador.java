package exercicios.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class observador {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Tela do Observador");
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janela.setSize(800,600);
        janela.setLayout(new FlowLayout());
        //janela.setLocation();
        janela.setLocationRelativeTo(null);

        JButton botao = new JButton("Clicar");
        botao.addActionListener(e -> {
            System.out.println("Evento ocorrido!!!");
        });
        janela.add(botao);

        janela.setVisible(true);
    }
}
