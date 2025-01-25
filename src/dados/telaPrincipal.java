package dados;

import javax.swing.*;

public class telaPrincipal {
    private JPanel painelPrincipal;
    private JButton cadastrarClienteButton;
    private JButton cadastrarVeículoButton;
    private JButton verificarEstoqueButton;
    private JTextArea textArea1;
    private JButton verificarListaDeClientesButton;
    private JButton sairButton;

    public telaPrincipal(Administracao administracao, JanelaPrincipal janelaPrincipal) {
        cadastrarClienteButton.addActionListener(e -> {
            JFrame cadastroCliente = new JFrame("Cadastro de Cliente");
            cadastroCliente.setContentPane(new telaCliente(administracao, new JanelaCliente(administracao)).getPainelCliente());
            cadastroCliente.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            cadastroCliente.pack();
            cadastroCliente.setVisible(true);
        });
        cadastrarVeículoButton.addActionListener(e -> {
           JFrame cadastroVeiculo = new JFrame("Cadastro de Veículo");
           cadastroVeiculo.setContentPane((new telaVeiculo(administracao, new JanelaVeiculo(administracao)).getPainelVeiculo()));
           cadastroVeiculo.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
           cadastroVeiculo.pack();
           cadastroVeiculo.setVisible(true);
        });

    }
    public JPanel getPainelPrincipal() {return painelPrincipal;}

}
