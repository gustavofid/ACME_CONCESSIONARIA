package dados;

import java.util.ArrayList;

public class Administracao {

    private ArrayList<Veiculo> listaVeiculos;

    public Administracao() {
        listaVeiculos = new ArrayList<>();
    }
    public boolean addVeiculo(Veiculo veiculo) {
        for(int i=0; i<listaVeiculos.size(); i++) {
            if(listaVeiculos.get(i) == veiculo){
                return false;
            }
        }
        listaVeiculos.add(veiculo);
        return true;
    }
}
