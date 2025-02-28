package dados;

public class Cliente {
    private String nome;
    private String cpf;
    private String email;
    private String telefone;
    private double valor;
    private int parcelas;

    public Cliente(String nome, String cpf, String email, String telefone, double valor, int parcelas) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.valor = valor;
        this.parcelas = parcelas;
    }
    public String getNome() {return nome;}
    public String getCpf() {return cpf;}
    public String getEmail() {return email;}
    public String getTelefone() {return telefone;}
    public double getValor() {return valor;}
    public double getParcelas() {return parcelas;}

    public String toString(){
        return String.format("""
                -------------------------------------------------------------
                Nome do Cliente: %s
                CPF do Cliente: %s
                Email do Cliente: %s
                Telefone do Cliente: %s
                Entrada: R$ %.2f
                Parcelas: %d
                """,nome,cpf,email,telefone,valor,parcelas);
    }
}
