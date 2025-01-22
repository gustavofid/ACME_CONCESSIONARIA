package dados;

import java.util.ArrayList;

public class Administracao {

    private ArrayList<Veiculo> listaVeiculos;
    private ArrayList<Cliente> listaClientes;

    public Administracao() {
        listaVeiculos = new ArrayList<>();
        listaClientes = new ArrayList<>();
    }
    public ArrayList<Veiculo> getListaVeiculos() {return listaVeiculos;}
    public ArrayList<Cliente> getListaClientes() {return listaClientes;}

    public boolean addVeiculo(Veiculo veiculo) {
        for(int i=0; i<listaVeiculos.size(); i++) {
            if(listaVeiculos.get(i).equals(veiculo.getPlaca())){
                return false;
            }
        }
        listaVeiculos.add(veiculo);
        return true;
    }
    public boolean removeVeiculo(Veiculo veiculo) {
        for(int i=0; i<listaVeiculos.size(); i++) {
            if(listaVeiculos.get(i).equals(veiculo.getPlaca())){
                listaVeiculos.remove(i);
                return true;
            }
        }
        return false;
    }
    public boolean addCliente(Cliente cliente) {
        for(int i=0; i<listaClientes.size(); i++) {
            if(listaClientes.get(i).equals(cliente.getCpf())){
                return false;
            }
        }
        listaClientes.add(cliente);
        return true;
    }

    public double simulaFinanciamento(Veiculo v, Cliente c){
        int n_parcelas = 10;
        double valorEntrada = c.getValor();
        double valorComEntrada = v.getPreco() - valorEntrada;
        return (valorComEntrada)/n_parcelas ;

    }

}
