package acaoBolsa;

import java.text.DecimalFormat;

public class AcaoBolsa {

    private String nome;
    private double aporte;
    private String data;
    private double valorAtual;
    private double lucro;
    private double retorno;
    
    //variaveis usadas para formatar e converter os valores númericos
    private DecimalFormat formato = new DecimalFormat("0.00");
    private String recebeDouble; //recebe uma String formatada tendo com base um Double
    private String parte[]; //recebe as partes da String que serão divididas atraves de um split("[,]")
    private String recebeParte; //junta as partes que foram divididas e coloca um ponto onde era a virgula

    public AcaoBolsa(String nome, double aporte, String data, double valorAtual) {

        
        this.nome = nome;
        this.aporte = aporte;
        this.data = data;
        this.valorAtual = valorAtual;
        
        
        recebeDouble = formato.format((this.valorAtual - this.aporte));
        parte = recebeDouble.split("[,]");
        recebeParte = parte[0] + "." + parte[1];
        this.lucro = Double.parseDouble(recebeParte);

        recebeDouble = formato.format((((this.valorAtual / this.aporte) - 1) * 100));
        parte = recebeDouble.split("[,]");
        recebeParte = parte[0] + "." + parte[1];
        this.retorno = Double.parseDouble(recebeParte);

    }

    public String getNome() {
        return nome;
    }

    public double getAporte() {
        return aporte;
    }

    public String getData() {
        return data;
    }

    public double getValorAtual() {
        return valorAtual;
    }

    public double getLucro() {
        return lucro;
    }

    public double getRetorno() {
        return retorno;
    }

    public void setValorAtual(double valorAtual) {
        this.valorAtual = valorAtual;
    }

    public void setLucro() {
        recebeDouble = formato.format((this.valorAtual - this.aporte));
        parte = recebeDouble.split("[,]");
        recebeParte = parte[0] + "." + parte[1];
        this.lucro = Double.parseDouble(recebeParte);
    }

    public void setRetorno() {
        recebeDouble = formato.format((((this.valorAtual / this.aporte) - 1) * 100));
        parte = recebeDouble.split("[,]");
        recebeParte = parte[0] + "." + parte[1];
        this.retorno = Double.parseDouble(recebeParte);
    }

}
