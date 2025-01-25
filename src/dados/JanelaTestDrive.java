package dados;

import javax.swing.*;

public class JanelaTestDrive extends JDialog {
    private telaTesteDrive tela;

    public JanelaTestDrive(Administracao adm) {
        super();
        tela = new telaTesteDrive(adm, JanelaTestDrive.this);
        if(tela.getPainelTestDrive() != null) {
            this.add(tela.getPainelTestDrive());
        }else{
            System.out.println("ERRO");
        }

        setSize(800,600);
        setTitle("Solicitar Test Drive");
        this.setModal(true);
        setVisible(true);
    }

}
