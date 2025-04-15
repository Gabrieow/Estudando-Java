package model;

public enum Meses {

    JANEIRO(31, 1, Estacoes.VERAO),
    FEVEREIRO(28, 2, Estacoes.VERAO),
    MARCO(31,3, Estacoes.OUTONO),
    ABRIL(30, 4, Estacoes.OUTONO),
    MAIO(31,5, Estacoes.OUTONO),
    JUNHO(30, 6, Estacoes.INVERNO),
    JULHO(31,7, Estacoes.INVERNO),
    AGOSTO(31,8, Estacoes.INVERNO),
    SETEMBRO(30, 9, Estacoes.PRIMAVERA),
    OUTUBRO(31,10, Estacoes.PRIMAVERA),
    NOVEMBRO(30, 11, Estacoes.PRIMAVERA),
    DEZEMBRO(31,12, Estacoes.VERAO);

    private int qntDias;
    private int numeroMes;
    private Estacoes estacao;

    private Meses(int qntDias, int numeroMes, Estacoes estacao) {
        this.qntDias = qntDias;
        this.numeroMes = numeroMes;
        this.estacao = estacao;
    }

    public Estacoes getEstacao() {
        return estacao;
    }

    public int getNumeroMes() {
        return numeroMes;
    }

    public int getQntDias() {
        return qntDias;
    }
    
    public String numeroDias(Meses mesEscolhido) {
        return mesEscolhido.name() + ": " + mesEscolhido.getQntDias() + " dias";
    }
}
