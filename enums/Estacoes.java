package model;

public enum Estacoes {

    VERAO("Verão"),
    OUTONO("Outono"),
    INVERNO("Inverno"),
    PRIMAVERA("Primavera");

    private String estacao;

    private Estacoes(String estacao) {
        this.estacao = estacao;
    }

    public String getEstacao() {
        return estacao;
    }

    public void setEstacao(String estacao) {
        this.estacao = estacao;
    }

}
