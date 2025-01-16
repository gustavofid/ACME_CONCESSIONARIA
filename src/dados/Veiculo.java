package dados;

public class Veiculo {
    private double preco;
    private String placa;
    private String marca;
    private String modelo;
    private String cor;
    private int ano;
    private String tipo;
    private double quilometragem;
    private String historico;


    public Veiculo(double preco, String placa, String marca, String modelo, String cor, int ano, String tipo, double quilometragem){
        this.preco = preco;
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.tipo = tipo;
        this.quilometragem = quilometragem;
    }
    public double getPreco() {return preco;}
    public String getPlaca() {return placa;}
    public String getMarca() {return marca;}
    public String getModelo() {return modelo;}
    public String getCor() {return cor;}
    public int getAno() {return ano;}
    public String getTipo() {return tipo;}
    public double getQuilometragem() {return quilometragem;}
    public String getHistorico() {return historico;}

    public double calculaIPVA(){
        return getPreco()*0.01;
    }
    public double calculaFinanciamento(){
        return 0;
    }
}
