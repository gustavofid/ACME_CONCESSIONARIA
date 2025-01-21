package dados;

public class Cliente {
    private String nome;
    private String cpf;
    private String email;
    private String telefone;
    private double pagamento;
    private int parcelas;

    public Cliente(String nome, String cpf, String email, String telefone, double pagamento, int parcelas) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.pagamento = pagamento;
        this.parcelas = parcelas;
    }
    public String getNome() {return nome;}
    public String getCpf() {return cpf;}
    public String getEmail() {return email;}
    public String getTelefone() {return telefone;}
    public double getPagamento() {return pagamento;}
    public double getParcelas() {return parcelas;}

}
