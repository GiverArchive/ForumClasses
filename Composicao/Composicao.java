public class Composicao {
  public static void main(String[] args) {
    // Criamos um jogador
    Jogador jogador = new Jogador("Giver");
    /*
     Progressoodemos obter o Progresso, mas, pera lá, da onde saiu esse progresso?
     Nosso jogador o criou quando foi instanciado, e assim que for destruído
     o progresso é destruído também.

     O Progresso é uma classe que compõe o Jogador
     */
    Progresso progresso = jogador.getProgresso();
  }
}
