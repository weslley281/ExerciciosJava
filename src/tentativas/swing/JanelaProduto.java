package tentativas.swing;

import javax.swing.*;
import java.awt.*;

public class JanelaProduto extends JDialog {
    private JTextField txtCodigo, txtNome, txtQuantidade;
    private JTable tblProdutos;
    private JButton btnIncluir, btnExcluir;

    public JanelaProduto(){
        JPanel edicao = new JPanel(new GridLayout(4, 2));
        edicao.add(new JLabel("Codigo:"));
        edicao.add(txtCodigo = new JTextField(20));
        edicao.add(new JLabel("Nome:"));
        edicao.add(txtNome = new JTextField(20));
        edicao.add(new JLabel("Quantidade:"));
        edicao.add(txtQuantidade = new JTextField(20));
        edicao.add(btnIncluir = new JButton("Incluir"));
        edicao.add(btnExcluir = new JButton("Excluir"));

        JScrollPane listagem = new JScrollPane();

        this.setLayout(new GridLayout(2, 1));
        this.add(edicao);
    }

    public static void main(String[] args) {
        JanelaProduto janela = new JanelaProduto();
        janela.setModal(true);
        janela.setBounds(0,0,300,200);
        janela.setVisible(true);
    }

    private class JScrollPane {
    }
}
