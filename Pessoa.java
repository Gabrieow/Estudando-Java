// Criar uma classe "Pessoa" com os atributos nome e idade. Adicione um método "apresentar" que imprime o nome e idade da pessoa

public class Pessoa{
    public String nome;
    public int idade;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public void apresentar(){
        System.out.println("Nome: " + nome + "\nIdade: " + idade);
    }
}