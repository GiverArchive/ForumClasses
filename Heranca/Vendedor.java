public class Vendedor extends Pessoa {

  // Aqui declaramos características próprias do vendededor
  public String setor;

  public Vendedor(String nome, int idade, String setor) {
    // Passamos as características essenciais da classe Pessoa
    super(nome, idade);
    // Definimos as características próprias da classe Vendedor
    this.setor = setor;
  }

  // Sobrescrevemos o comportamento padrão de trabalhar, agora com o contexto de um vendedor
  @Override
  public void trabalhar() {
    System.out.println("Vendendo - " + setor + ": " + nome);
  }
}
