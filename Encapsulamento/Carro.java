public class Carro {

  // Declaramos as características como privadas, assim só a classe pode ter acesso
  private String marca;
  private String modelo;
  private int combustivel;

  public Carro(String marca, String modelo) {
    this.marca = marca;
    this.modelo = modelo;
  }

  // Só podemos acessar a marca pelo método getMarca()
  public String getMarca() {
    return marca;
  }

  // Só podemos acessar o modelo pelo método getModelo()
  public String getModelo() {
    return modelo;
  }

  // Só podemos acessar o nível de combustível através do método getCombustivel()
  public int getCombustivel() {
    return combustivel;
  }

  // Só podemos manipular o combustível através deste método
  public void abastecer() {
    combustivel = 100;
    System.out.printf("Abastecendo %s (%s)!%n", getModelo(), getMarca());
  }

  // Manipulação do combustível pela ação de andar
  public void andar() {
    System.out.printf("%s (%s) andando!%n", getModelo(), getMarca());
    combustivel -= 2;
  }
}
