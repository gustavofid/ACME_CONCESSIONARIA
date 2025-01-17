package dados;

import javax.swing.*;

public class JanelaCliente extends JDialog {
    private telaCliente tela;

    public JanelaCliente(Administracao adm) {
        super();
        tela = new telaCliente(adm, JanelaCliente.this);
        this.add(tela.getPainelCliente());

        setSize(800,600);
        setTitle("Cadastro de Cliente");
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setModal(true);
        setVisible(true);
    }

}
