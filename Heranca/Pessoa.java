public class Pessoa {

  // Características da classe Pessoa
  public String nome;
  public int idade;

  // Definição das características de Pessoa
  public Pessoa(String nome, int idade) {
    this.nome = nome;
    this.idade = idade;
  }

  // Comportamento padrão de trabalhar
  public void trabalhar() {
    System.out.println("Trabalhando: " + nome);
  }
}
