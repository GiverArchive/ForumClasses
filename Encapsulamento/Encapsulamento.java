public class Encapsulamento {
  public static void main(String[] args) {
    Carro carro = new Carro("Fiat", "Uno");
    System.out.printf("Carro %s, da %s, criado.%n", carro.getModelo(), carro.getMarca());

    System.out.println("Combustível antes de abastecer: " + carro.getCombustivel());
    carro.abastecer();
    System.out.println("Combustível depois de abastecer: " + carro.getCombustivel());
    carro.andar();
    System.out.println("Combustível depois de andar: " + carro.getCombustivel());
  }
}
