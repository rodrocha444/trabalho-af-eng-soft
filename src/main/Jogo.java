package main;

import java.util.Scanner;

import main.Arma.Tipo;
import utils.Utilitarios;

public class Jogo {
  static Scanner scanner = new Scanner(System.in).useDelimiter("\n");

  public static Jogador jogador = new Jogador(0, 0, 100, 1000);
  public static Arma Metralhadora50 = new Arma(30, 20, Tipo.METRALHADORA, "Metralhadora .50");
  public static Arma MetralhadoraM61A2 = new Arma(35, 0, Tipo.METRALHADORA, "Metralhadora M61A2");
  public static Arma MisselAIM_9 = new Arma(40, 2, Tipo.MISSEL, "Míssel AIM-9");
  public static Arma MisselAIM_120 = new Arma(45, 0, Tipo.MISSEL, "Míssel AIM-120");
  public static Arma Bombas1000libras = new Arma(75, 5, Tipo.BOMBA, "Bombas 1000 Libras");
  public static Arma BombasGuiadas = new Arma(100, 5, Tipo.BOMBA, "Bombas Guiadas");
  public static Blindagem Blindagem1 = new Blindagem(0, 10, "Blindagem 1");
  public static Blindagem Blindagem2 = new Blindagem(0, 20, "Blindagem 2");
  public static Blindagem Blindagem3 = new Blindagem(5, 30, "Blindagem 3");
  public static Blindagem Blindagem4 = new Blindagem(10, 40, "Blindagem 4");
  public static Blindagem Blindagem5 = new Blindagem(10, 50, "Blindagem 5");

  public static int selecionarArea() {
    Utilitarios.clearConsole();
    System.out.println("Escolha a área de combate:");
    System.out.println("1 - Brasil");
    System.out.println("2 - EUA");
    System.out.println("3 - Canada");
    System.out.println("4 - Congo");
    System.out.println("5 - Marrocos");
    System.out.println("6 - Russia");
    System.out.println("7 - Australia");
    System.out.println("8 - China");
    System.out.print("Digite a área desejada: ");
    return scanner.nextInt();
  }

  public static void startPage() {

    int valorEscolhido = 0;

    while (valorEscolhido != 1 && valorEscolhido != 2) {
      Utilitarios.clearConsole();
      System.out.println("Escolha a área de combate:");
      System.out.println("1 - Começar");
      System.out.println("2 - Sair");
      System.out.print("Digite a opção desejada: ");
      valorEscolhido = scanner.nextInt();
    }

    if (valorEscolhido == 2)
      System.exit(0);
  }
}
