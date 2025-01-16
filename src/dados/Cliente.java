package dados;

public class Cliente {
    private String nome;
    private String cpf;
    private String email;
    private long telefone;
    private double pagamento;

    public Cliente(String nome, String cpf, String email, long telefone, double pagamento) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.pagamento = pagamento;
    }
    public String getNome() {return nome;}
    public String getCpf() {return cpf;}
    public String getEmail() {return email;}
    public long getTelefone() {return telefone;}
    public double getPagamento() {return pagamento;}

}
