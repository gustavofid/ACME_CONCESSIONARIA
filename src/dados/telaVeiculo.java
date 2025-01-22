package dados;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class telaVeiculo {
    private JPanel painelVeiculo;
    private JTextArea campoMensagem;
    private JTextField idVeiculo;
    private JTextField marcaVeiculo;
    private JTextField modeloVeiculo;
    private JTextField corVeiculo;
    private JTextField anoVeiculo;
    private JComboBox tipoVeiculo;
    private JTextField kmVeiculo;
    private JButton cadastrarVeiculo;
    private JTextField precoVeiculo;
    private JTextField historicoVeiculo;

    public telaVeiculo(Administracao adm, JanelaVeiculo janelaVeiculo) {
        if (adm == null) {
            throw new IllegalArgumentException("Instância de Administracao não pode ser nula!");
        }
        cadastrarVeiculo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    String placa = idVeiculo.getText();
                    String marca = marcaVeiculo.getText();
                    String modelo = modeloVeiculo.getText();
                    String cor = corVeiculo.getText();
                    int ano = Integer.parseInt(anoVeiculo.getText());
                    String tipo = tipoVeiculo.getSelectedItem().toString();
                    double km = Double.parseDouble(kmVeiculo.getText());
                    String historico = historicoVeiculo.getText();
                    double preco = Double.parseDouble(precoVeiculo.getText());
                    Veiculo veiculo;

                    if(tipoVeiculo.getSelectedItem().toString().equals("SUV")){
                        veiculo = new Veiculo(placa,marca,modelo,cor,ano,tipo,km,historico,preco);
                        adm.addVeiculo(veiculo);
                        campoMensagem.setText("Veículo cadastado com sucesso!");
                    }else if(tipoVeiculo.getSelectedItem().toString().equals("Sedan")){
                        veiculo = new Veiculo(placa,marca,modelo,cor,ano,tipo,km,historico,preco);
                        adm.addVeiculo(veiculo);
                        campoMensagem.setText("Veículo cadastado com sucesso!");
                    }else if(tipoVeiculo.getSelectedItem().toString().equals("Esportivo")){
                        veiculo = new Veiculo(placa,marca,modelo,cor,ano,tipo,km,historico,preco);
                        adm.addVeiculo(veiculo);
                        campoMensagem.setText("Veículo cadastado com sucesso!");
                    }else{
                        campoMensagem.setText("Selecione o tipo do veículo!");
                    }

            }catch(Exception ex){
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        });
    }
    public JPanel getPainelVeiculo() {return painelVeiculo;}
}
