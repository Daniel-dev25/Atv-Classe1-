package thiago;

public class Despesa {

    // Atributos Privados ("-")
    private String prazo;
    private double valores;
    private String nfE;
    private String baixa;

    // Construtor
    public Despesa(String prazo, double valores, String nfE, String baixa) {
        this.prazo = prazo;
        this.valores = valores;
        this.nfE = nfE;
        this.baixa = baixa;
    }

    // Método Público ("+")
    public void pagamento() {
        System.out.println("Processando pagamento da despesa...");
    }

    // Getters e Setters (necessários para o Main.java)
    public String getPrazo() { return prazo; }
    public void setPrazo(String prazo) { this.prazo = prazo; }
    public double getValores() { return valores; }
    public void setValores(double valores) { this.valores = valores; }
    public String getNfE() { return nfE; }
    public void setNfE(String nfE) { this.nfE = nfE; }
    public String getBaixa() { return baixa; }
    public void setBaixa(String baixa) { this.baixa = baixa; }
}