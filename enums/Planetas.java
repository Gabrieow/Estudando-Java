package model;

public enum Planetas {
    
    MERCURIO(3.30, 2439.7),
    VENUS(5.24, 6051.8),
    TERRA(5.52, 6371.0),
    MARTE(3.93, 3389.5),
    JUPITER(1.33, 69911.0),
    SATURNO(0.69, 58232.0),
    URANO(1.27, 25362.0),
    NETUNO(1.64, 24622.0),
    PLUTAO(2.03, 1188.3);

    private double massa;
    private double raio;

    private Planetas(double massa, double raio) {
        this.massa = massa;
        this.raio = raio;
    }

    public double getMassa() {
        return massa;
    }

    public void setMassa(double massa) {
        this.massa = massa;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}

