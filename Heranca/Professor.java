public class Professor extends Pessoa {

  // Aqui podemos declarar caracteríscas próprias desta subclasse
  public String disciplina;

  public Professor(String nome, int idade, String disciplina) {
    // Passamos argumentos para o construtor da classe Pessoa, afinal, extendemos Pessoa
    super(nome, idade);
    // Definimos as características próprias da classe Professor
    this.disciplina = disciplina;
  }

  // Sobrescrevemos o comportamento padrão trabalhar, agora como Professor
  @Override
  public void trabalhar() {
    System.out.println("Lecionando - " + disciplina + ": " + nome);
  }
}
