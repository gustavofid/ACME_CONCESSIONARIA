package dados;

import javax.swing.*;

public class JanelaPrincipal extends JDialog {
    private telaPrincipal tela;

    public JanelaPrincipal(Administracao adm) {
        super();
        tela = new telaPrincipal(adm, JanelaPrincipal.this);
        if(tela.getPainelPrincipal() != null) {
            this.add(tela.getPainelPrincipal());
        }else{
            System.out.println("ERRO");
        }

        setSize(800,600);
        setTitle("Janela Principal");
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setModal(true);
        setVisible(true);
    }

}
