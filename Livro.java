//Criar uma classe "Livro" com os atributos título, autor e ano de publicação. Adicione um método "informacoes" que imprime as informações do livro

public class Livro {
    String titulo;
    String autor;
    String anoPublicacao;

    public Livro(String titulo, String autor, String anoPublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public void informacoes(){
        System.out.println("Título: " + titulo + "Autor: " + autor + "Ano de Publicação" + anoPublicacao);
    }

}
