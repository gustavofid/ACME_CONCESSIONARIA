package dados;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class telaPrincipal {
    private JPanel painelPrincipal;
    private JButton cadastrarClienteButton;
    private JButton cadastrarVeículoButton;
    private JButton verificarEstoqueButton;
    private JTextArea campoPrincipal;
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
        verificarEstoqueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (!administracao.getListaVeiculos().isEmpty()) {
                        StringBuilder estoque = new StringBuilder("Veículos em estoque:\n");
                        for (Veiculo v : administracao.getListaVeiculos()) {
                            estoque.append(v.toString()).append("\n");
                        }
                        campoPrincipal.setText(estoque.toString());
                    } else {
                        campoPrincipal.setText("O estoque está vazio no momento!");
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        verificarListaDeClientesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    if(!administracao.getListaClientes().isEmpty()){
                        StringBuilder listaClientes = new StringBuilder("Clientes Cadastrados:\n");
                        for (Cliente c: administracao.getListaClientes()) {
                            listaClientes.append(c.toString()).append("\n");
                        }
                        campoPrincipal.setText(listaClientes.toString());
                    }else{
                        campoPrincipal.setText("Nenhum cliente cadastrado!");
                    }

                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        sairButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

    }
    public JPanel getPainelPrincipal() {return painelPrincipal;}

}
