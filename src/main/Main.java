package main;

import utils.Utilitarios;

public class Main {
  public static void main(String[] args) throws Exception {
    Utilitarios.clearConsole();
    System.out.println("Iniciando o jogo...");
    Thread.sleep(1000);

    Jogo.startPage();
    int areaSelecionada = Jogo.selecionarArea();

    System.out.println(areaSelecionada);
  }

}
