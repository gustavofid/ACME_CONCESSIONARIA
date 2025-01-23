package aplicacao;
import dados.*;

public class ACME_CONCESSIONARIA {
    private Administracao adm = new Administracao();
    private JanelaCliente janelaCliente = new JanelaCliente(adm);
    private JanelaVeiculo janelaVeiculo = new JanelaVeiculo (adm);
    private JanelaPrincipal janelaPrincipal = new JanelaPrincipal(adm);

    public void executar(){
      new telaPrincipal(adm, janelaPrincipal);
      new telaCliente(adm,janelaCliente);
      new telaVeiculo(adm,janelaVeiculo);
    }
}
