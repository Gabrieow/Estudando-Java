public class Carro{
    public String marca;
    public String modelo;
    public boolean ligado;
    public boolean andando;

    public Carro(){}

    public Carro(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
        ligado = false;
        andando = false; 
    }

    public void ligar(){
        ligado = true;
    }

    public void desligar(){
        ligado = false;
    }

    public void andar(){
        andando = true;
    }

    public void parar(){
        andando = false;
    }
}