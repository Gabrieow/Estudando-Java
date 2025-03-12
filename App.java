public class App {
    public static void main(String[] args) throws Exception {

        Carro carro1 = new Carro();
        carro1.marca = "Peugeot";
        carro1.modelo = "208";

        carro1.ligar();
        carro1.andar();

        System.out.println("Marca " + carro1.marca + "\nModelo " + carro1.modelo + "\nLigado: " + carro1.ligado + "Andando: " + carro1.andando);
        

        Pessoa pessoa = new Pessoa("João", 15);
        pessoa.apresentar();

        Livro livro = new Livro("Cthulhu", "Lovecraft", "1920");
        livro.informacoes();

    }
}
