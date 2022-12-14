package main;

public class App {
  Arma Metralhadora50 = new Arma(30, 20);
  Arma MetralhadoraM61A2 = new Arma(35, 0);
  Arma MisselAIM_9 = new Arma(40, 20);
  Arma MisselAIM_120 = new Arma(45, 0);
  Arma Bombas1000libras = new Arma(75, 5);
  Arma BombasGuiadas = new Arma(100, 5);

  Blindagem Blindagem1 = new Blindagem(0, 10);
  Blindagem Blindagem2 = new Blindagem(0, 20);
  Blindagem Blindagem3 = new Blindagem(5, 30);
  Blindagem Blindagem4 = new Blindagem(10, 40);
  Blindagem Blindagem5 = new Blindagem(10, 50);

  public static void main(String[] args) throws Exception {
    System.out.println("\nHello, World!");
  }

}
