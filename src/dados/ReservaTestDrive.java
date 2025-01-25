package dados;

public class ReservaTestDrive {
    private Cliente cliente;
    private Veiculo veiculo;

    public ReservaTestDrive(Cliente cliente, Veiculo veiculo) {
        this.cliente = cliente;
        this.veiculo = veiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    @Override
    public String toString() {
        return "Cliente: " + cliente.getNome() + " (CPF: " + cliente.getCpf() + ")" +
                " -> Veículo: " + veiculo.getModelo() + " (Placa: " + veiculo.getPlaca() + ")";
    }
}

