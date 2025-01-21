package dados;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class telaCliente {
    private JPanel painelCliente;
    private JTextArea campoMensagem;
    private JTextField nomeCliente;
    private JTextField cpfCliente;
    private JTextField emailCilente;
    private JTextField telefoneCliente;
    private JComboBox pagamentoCliente;
    private JTextField parcelasCliente;
    private JTextField valorCliente;
    private JButton cadastrarButton;

    public telaCliente(Administracao adm, JanelaCliente janelaCliente) {
        cadastrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Cliente cliente = null;
                try{
                    String nome = nomeCliente.getText();
                    String cpf = cpfCliente.getText();
                    String email = emailCilente.getText();
                    String telefone = telefoneCliente.getText();
                    double valor = Double.parseDouble(valorCliente.getText());

                    if(pagamentoCliente.getSelectedItem().toString().equals("À vista")){
                        cliente = new Cliente(nome,cpf,email,telefone,valor,0);
                        campoMensagem.setText("Cliente cadastrado com sucesso!");
                    } else if(pagamentoCliente.getSelectedItem().toString().equals("Financiamento")) {
                        int parcelas = Integer.parseInt(parcelasCliente.getText());
                        cliente = new Cliente(nome,cpf,email,telefone,valor,parcelas);
                        campoMensagem.setText("Cliente cadastrado com sucesso!");
                    }else {
                        campoMensagem.setText("Selecione uma forma de pagamento");
                    }

                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        });
}
    public JPanel getPainelCliente() { return painelCliente; }
}
