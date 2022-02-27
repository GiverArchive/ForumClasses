import java.util.ArrayList;
import java.util.List;

/*
  A classe Turma deprende de Aluno para funcionar, mas não precisa estar necessariamente instanciada
*/
public class Turma {

  private final List<Aluno> alunos;
  private final String nome;

  public Turma(String nome) {
    this.nome = nome;
    this.alunos = new ArrayList<>();
  }

  public List<Aluno> getAlunos() {
    return alunos;
  }

  public void adicionarAluno(Aluno aluno) {
    this.alunos.add(aluno);
  }

  public void removerAluno(Aluno aluno) {
    this.alunos.remove(aluno);
  }
}
