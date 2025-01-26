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
        return String.format("""
                -------------------------------------------------------------
                Cliente: %s
                CPF do Cliente: %s
                Modelo do Veículo: %s
                Placa do veiculo: %s
                """,cliente.getNome(),cliente.getCpf(),veiculo.getModelo(),veiculo.getPlaca());
    }
}

