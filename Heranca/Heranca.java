public class Heranca {
  public static void main(String[] args) {
    // Criamos o João como Pessoa e o colocamos para trabalhar
    Pessoa pessoaJoao = new Pessoa("João", 20);
    pessoaJoao.trabalhar();

    // Criamos o Carlos como Professor, que herda as características de Pessoa e o colocamos para trabalhar
    Pessoa professorCarlos = new Professor("Carlos", 29, "Matemática");
    professorCarlos.trabalhar();

    // Criamos o Erik como Vendedor, que herda as características de Pessoa e o colocamos para trabalhar
    Pessoa vendedorErik = new Vendedor("Erik", 37, "Artigos de Pesca");
    vendedorErik.trabalhar();
  }
}
