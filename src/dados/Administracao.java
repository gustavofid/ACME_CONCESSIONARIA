package dados;

import java.util.ArrayList;

public class Administracao {

    private ArrayList<Veiculo> listaVeiculos;

    public Administracao() {
        listaVeiculos = new ArrayList<>();
    }
    public ArrayList<Veiculo> getListaVeiculos() {return listaVeiculos;}

    public boolean addVeiculo(Veiculo veiculo) {
        for(int i=0; i<listaVeiculos.size(); i++) {
            if(listaVeiculos.get(i) == veiculo){
                return false;
            }
        }
        listaVeiculos.add(veiculo);
        return true;
    }
    public boolean removeVeiculo(Veiculo veiculo) {
        for(int i=0; i<listaVeiculos.size(); i++) {
            if(listaVeiculos.get(i) == veiculo){
                listaVeiculos.remove(i);
                return true;
            }
        }
        return false;
    }
    public double simulaFinanciamento(Veiculo v, Cliente c){
        int n_parcelas = 10;
        double valorEntrada = c.getPagamento();
        double valorComEntrada = v.getPreco() - valorEntrada;
        return (valorComEntrada)/n_parcelas ;

    }

}
