package dados;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class telaFinanciamento {

    private JTextField cpfCliente;
    private JTextField placaVeiculo;
    private JButton financiarButton;
    private JPanel painelFinanciamento;
    private JTextArea campoMensagem;
    private JButton voltarButton;

    public telaFinanciamento(Administracao adm, JanelaFinanciamento janelaFinanciamento) {


        voltarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                janelaFinanciamento.setVisible(false);
            }
        });
    }
    public JPanel getPainelFinanciamento() { return painelFinanciamento; }
}
