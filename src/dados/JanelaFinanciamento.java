package dados;

import javax.swing.*;

public class JanelaFinanciamento extends JDialog {
    private telaFinanciamento tela;

    public JanelaFinanciamento(Administracao adm) {
        super();
        tela = new telaFinanciamento(adm, JanelaFinanciamento.this);
        if(tela.getPainelFinanciamento() != null) {
            this.add(tela.getPainelFinanciamento());
        }else{
            System.out.println("ERRO");
        }

        setSize(800,600);
        setTitle("Janela Financiamento");
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setModal(true);
        setVisible(true);
    }

}
