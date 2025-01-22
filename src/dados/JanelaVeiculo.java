package dados;

import javax.swing.*;

public class JanelaVeiculo extends JDialog {
    private telaVeiculo tela;

    public JanelaVeiculo(Administracao adm) {
        super();
        tela = new telaVeiculo(adm, JanelaVeiculo.this);
        if(tela.getPainelVeiculo() != null) {
            this.add(tela.getPainelVeiculo());
        }else{
            System.out.println("ERRO");
        }

        setSize(800,600);
        setTitle("Cadastro de Veículo");
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setModal(true);
        setVisible(true);
    }

}
