public class Agregacao {
  public static void main(String[] args) {
    // Turma criada, até o momento, nenhum aluno envolvido
    Turma turma = new Turma("Engenharia de Software");

    // Criando alguns alunos
    Aluno marcos = new Aluno("Marcos", 1);
    Aluno ana = new Aluno("Ana", 2);
    Aluno mariano = new Aluno("Mariano", 3);
    Aluno fabio = new Aluno("Fabio", 4);
    Aluno luana = new Aluno("Luana", 5);

    // Agregamos todos os alunos à turma
    turma.adicionarAluno(marcos);
    turma.adicionarAluno(ana);
    turma.adicionarAluno(mariano);
    turma.adicionarAluno(fabio);
    turma.adicionarAluno(luana);

    System.out.println("Alunos da turma de Engenharia: " + turma.getAlunos());

    // Observe que podemos usar os alunos em outras turmas
    Turma turma = new Turma("Sociologia");
    turma.adicionarAluno(ana);
    turma.adicionarAluno(fabio);
  }
}
