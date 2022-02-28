public class Jogador {

  private final Progresso progresso;
  private final String nick;

  public Jogador(String nick) {
    this.nick = nick;
    // Criamos nosso objeto de composição
    this.progresso = new Progresso();
  }

  public String getNick() {
    return nick;
  }

  public Progresso getProgresso() {
    return progresso;
  }
}
