package dados;

public class Veiculo {

    private String placa;
    private String marca;
    private String modelo;
    private String cor;
    private int ano;
    private String tipo;
    private double quilometragem;
    private String historico;
    private double preco;


    public Veiculo(String placa, String marca, String modelo, String cor, int ano, String tipo, double quilometragem, String historico, double preco){
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.tipo = tipo;
        this.quilometragem = quilometragem;
        this.historico = historico;
        this.preco = preco;
    }

    public String getPlaca() {return placa;}
    public String getMarca() {return marca;}
    public String getModelo() {return modelo;}
    public String getCor() {return cor;}
    public int getAno() {return ano;}
    public String getTipo() {return tipo;}
    public double getQuilometragem() {return quilometragem;}
    public String getHistorico() {return historico;}
    public double getPreco() {return preco;}

    public double calculaIPVA(){
        return getPreco()*0.01;
    }

    public String toString() {

        return String.format("""
                -------------------------------------------------------------
                Placa do Veículo: %s
                Marca: %s
                Modelo: %s
                Cor: %s
                Ano: %d
                Tipo: %s
                Quilometragem: %.2f
                Historico: %s
                Preco: %.2f
                """,placa,marca,modelo,cor,ano,tipo,quilometragem,historico,preco);
    }


}
