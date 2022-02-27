/*
  A classe Aluno é um componente independente
 */
public class Aluno {

  private final String nome;
  private final int matricula;

  public Aluno(String nome, int matricula) {
    this.nome = nome;
    this.matricula = matricula;
  }

  public String getNome() {
    return nome;
  }

  public int getMatricula() {
    return matricula;
  }

  @Override
  public String toString() {
    return String.format("Aluno %s(%d)", nome, matricula);
  }
}
