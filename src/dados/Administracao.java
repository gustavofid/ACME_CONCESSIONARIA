package dados;

import javax.swing.*;
import java.util.ArrayList;

public class Administracao {

    private ArrayList<Veiculo> listaVeiculos;
    private ArrayList<Cliente> listaClientes;
    private ArrayList<ReservaTestDrive> listaTestesDrive;
    private telaTesteDrive telaDrive;

    public Administracao() {
        listaVeiculos = new ArrayList<>();
        listaClientes = new ArrayList<>();
        listaTestesDrive = new ArrayList<>();
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
    public void adicionaReservaTestDrive(Cliente cliente, Veiculo veiculo){
        ReservaTestDrive novaReserva = new ReservaTestDrive(cliente, veiculo);
        listaTestesDrive.add(novaReserva);
    }
    public void reservaTestDrive(String cpfCliente, String placaVeiculo){
        Cliente clienteEncontrado = null;
        Veiculo veiculoEncontrado = null;

        for (Cliente cliente : listaClientes) {
            if (cliente.getCpf().equals(cpfCliente)) {
                clienteEncontrado = cliente;
                break;
            }
        }

        for (Veiculo veiculo : listaVeiculos) {
            if (veiculo.getPlaca().equals(placaVeiculo)) {
                veiculoEncontrado = veiculo;
                break;
            }
        }

        if(veiculoEncontrado != null && clienteEncontrado != null){
            adicionaReservaTestDrive(clienteEncontrado, veiculoEncontrado);
        }else if(veiculoEncontrado == null){
            JOptionPane.showMessageDialog(null, "Erro: Veículo não encontrado!" , "Erro", JOptionPane.ERROR_MESSAGE);
        }if(clienteEncontrado == null){
            JOptionPane.showMessageDialog(null, "Erro: Cliente não encontrado!" , "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public ArrayList<ReservaTestDrive> getListaReservaTestDrive() {return listaTestesDrive;}

    public double simulaFinanciamento(Veiculo v, Cliente c){
        int n_parcelas = 10;
        double valorEntrada = c.getValor();
        double valorComEntrada = v.getPreco() - valorEntrada;
        return (valorComEntrada)/n_parcelas ;

    }

}
