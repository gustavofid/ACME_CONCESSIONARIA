package aplicacao;
import dados.*;

public class ACME_CONCESSIONARIA {
    //private JanelaCliente janelaCliente;
    private Administracao adm;

    public void executar(){
      new JanelaCliente(adm);
    }
}
