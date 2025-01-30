package dados;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class telaTesteDrive {
    private Administracao adm;
    private JTextField placaVeiculoTest;
    private JTextField cpfClienteTest;
    private JTextArea campoTestDrive;
    private JButton solicitarButton;
    private JPanel painelTestDrive;
    private JButton voltarButton;
    private JButton removerSolicitacaoButton;
    private List<String> reservas;

    public telaTesteDrive(Administracao adm, JanelaTestDrive janelaTestDrive) {
        if (adm == null) {
            throw new IllegalArgumentException("Instância de Administracao não pode ser nula!");
        }
        this.adm = adm;
        this.reservas = new ArrayList<>();

        solicitarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String clienteCpf = cpfClienteTest.getText();
                    String placaVeiculo = placaVeiculoTest.getText();

                    if (clienteCpf.isEmpty() || placaVeiculo.isEmpty()) {
                        campoTestDrive.setText("Por favor, preencha todos os campos!");
                    }

                    Cliente cliente = procurarCliente(clienteCpf);
                    if (cliente == null) {
                        JOptionPane.showMessageDialog(null, "Cliente com CPF " + clienteCpf + " não encontrado!", "Erro", JOptionPane.ERROR_MESSAGE);
                        return;
                    }

                    Veiculo veiculo = procurarVeiculo(placaVeiculo);
                    if (veiculo == null) {
                        JOptionPane.showMessageDialog(null, "Veículo com placa " + placaVeiculo + " não encontrado!", "Erro", JOptionPane.ERROR_MESSAGE);
                        return;
                    }

                    adm.adicionaReservaTestDrive(cliente, veiculo);

                    campoTestDrive.setText("Reserva realizada com sucesso!");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        voltarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                janelaTestDrive.setVisible(false);
            }
        });
        removerSolicitacaoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    String cpfCliente = cpfClienteTest.getText();
                    String placaVeiculo = placaVeiculoTest.getText();

                    if (cpfCliente.isEmpty() || placaVeiculo.isEmpty()) {
                        throw new IllegalArgumentException("Por favor, preencha todos os campos!");
                    }
                    boolean removido = adm.removeReservaTestDrive(cpfCliente, placaVeiculo);
                    if (removido) {
                        campoTestDrive.setText("Reserva removida com sucesso!");
                    }else{
                        JOptionPane.showMessageDialog(null, "Reserva não encontrada!","Erro", JOptionPane.ERROR_MESSAGE);
                    }
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

    }

    private Cliente procurarCliente(String cpf) {
        for (Cliente c : adm.getListaClientes()) {
            if (c.getCpf().equals(cpf)) {
                return c;
            }
        }
        return null;
    }

    private Veiculo procurarVeiculo(String placa) {
        for (Veiculo v : adm.getListaVeiculos()) {
            if (v.getPlaca().equals(placa)) {
                return v;
            }
        }
        return null;
    }

    private void atualizarCampoReservas() {
        StringBuilder textoReservas = new StringBuilder("Reservas de Test Drive:\n");
        for (String reserva : reservas) {
            textoReservas.append(reserva).append("\n");
        }
        campoTestDrive.setText(textoReservas.toString());
    }
    public List<String> getReservas() {return reservas;}

    public JPanel getPainelTestDrive() {
        return painelTestDrive;
    }
}
