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
    private JButton solicitarTestDriveButton;
    private JButton reservasDeTestDriveButton;
    private JButton simularFinancimentoButton;
    private JButton realizarVendaButton;

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
        solicitarTestDriveButton.addActionListener(e ->{
            JFrame testeDrive = new JFrame("Solicitar Test Drive");
            testeDrive.setContentPane((new telaTesteDrive(administracao, new JanelaTestDrive(administracao)).getPainelTestDrive()));
            testeDrive.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            testeDrive.pack();
            testeDrive.setVisible(true);
        });
        reservasDeTestDriveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (!administracao.getListaReservaTestDrive().isEmpty()) {
                        StringBuilder listaReservas = new StringBuilder("Reservas de Test Drive:\n");
                        for (ReservaTestDrive reserva : administracao.getListaReservaTestDrive()) {
                            listaReservas.append(reserva.toString()).append("\n");
                        }
                        campoPrincipal.setText(listaReservas.toString());
                    } else {
                        campoPrincipal.setText("Nenhuma reserva cadastrada!");
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        simularFinancimentoButton.addActionListener(e ->{
            JFrame simulaFinanciamento = new JFrame("Simular Financimento");
            simulaFinanciamento.setContentPane((new telaFinanciamento(administracao, new JanelaFinanciamento(administracao)).getPainelFinanciamento()));
            simulaFinanciamento.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            simulaFinanciamento.pack();
            simulaFinanciamento.setVisible(true);
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
