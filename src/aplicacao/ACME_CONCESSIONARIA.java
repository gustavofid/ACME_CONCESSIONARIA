package aplicacao;
import dados.*;

public class ACME_CONCESSIONARIA {
    //private JanelaCliente janelaCliente;
    private Administracao adm = new Administracao();
    private JanelaCliente janelaCliente = new JanelaCliente(adm);

    public void executar(){
      new telaCliente(adm,janelaCliente);
    }
}
