package dados;

import javax.swing.*;

public class JanelaCliente extends JDialog {
    private telaCliente tela;

    public JanelaCliente(Administracao adm) {
        super();
        tela = new telaCliente(adm, JanelaCliente.this);
        if(tela.getPainelCliente() != null) {
            this.add(tela.getPainelCliente());
        }else{
            System.out.println("ERRO");
        }

        setSize(800,600);
        setTitle("Cadastro de Cliente");
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setModal(true);
        setVisible(true);
    }

}
