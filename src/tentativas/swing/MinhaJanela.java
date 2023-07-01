package tentativas.swing;

import javax.swing.*;
import java.awt.*;

public class MinhaJanela extends JFrame {
    private final JButton button1 = new JButton("Sim");
    private final JButton button2 = new JButton("Não");

    public MinhaJanela() throws HeadlessException{
        super("Apenas um teste");
        setLayout(new BorderLayout());
        setBounds(10,10,300,200);
        JPanel jPanel = new JPanel(new FlowLayout());
        jPanel.add(button1);
        jPanel.add(button2);
        add(jPanel,"South");
    }

    public static void main(String[] args) {
        new MinhaJanela().setVisible(true);
    }
}

