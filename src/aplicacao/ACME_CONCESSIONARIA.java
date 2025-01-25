package aplicacao;
import dados.*;

public class ACME_CONCESSIONARIA {
    private Administracao adm = new Administracao();
    private JanelaPrincipal janelaPrincipal = new JanelaPrincipal(adm);

    public void executar(){
      new telaPrincipal(adm, janelaPrincipal);
    }
}
