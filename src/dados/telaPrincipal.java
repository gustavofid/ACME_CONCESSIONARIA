package dados;

import javax.swing.*;

public class telaPrincipal {
    private JPanel painelPrincipal;
    private JButton cadastrarClienteButton;

    public telaPrincipal(Administracao administracao, JanelaPrincipal janelaPrincipal) {
        cadastrarClienteButton.addActionListener(e -> {
            JFrame cadastroCliente = new JFrame("Cadastro de Cliente");
            cadastroCliente.setContentPane(new telaCliente(administracao, new JanelaCliente(administracao)).getPainelCliente());
            cadastroCliente.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            cadastroCliente.pack();
            cadastroCliente.setVisible(true);
        });

    }
    public JPanel getPainelPrincipal() {return painelPrincipal;}

}
