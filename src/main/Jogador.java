package main;

import java.util.ArrayList;

public class Jogador extends ForcaDefesa {
  private int vida;
  private int dinheiro;
  private Blindagem blindagem;
  ArrayList<Arma> armas = new ArrayList<Arma>();

  public Jogador(int ataque, int defesa, int vida, int dinheiro) {
    super(ataque, defesa);

    this.dinheiro = dinheiro;
    this.vida = vida;
  }

  public int getVida() {
    return vida;
  }

  public void setVida(int vida) {
    this.vida = vida;
  }

  public int getDinheiro() {
    return dinheiro;
  }

  public void setDinheiro(int dinheiro) {
    this.dinheiro = dinheiro;
  }

  void usarBlindagem(Blindagem blindagem) {
    this.blindagem = blindagem;
  }

  void usarArma(Arma arma) {
    boolean hasSameType = false;
    for (Arma i : this.armas) {
      if (i.tipo == arma.tipo) {
        hasSameType = true;
      }
    }
    if (!hasSameType)
      this.armas.add(arma);
  }

  public int getDefesa() {
    int totalDefesaArmas = 0;

    for (Arma i : this.armas) {
      totalDefesaArmas += i.getDefesa();
    }

    return this.blindagem.getDefesa() + totalDefesaArmas;
  }

  public int getAtaque() {
    int totalAtaqueArmas = 0;

    for (Arma i : this.armas) {
      totalAtaqueArmas += i.getAtaque();
    }

    return this.blindagem.getAtaque() + totalAtaqueArmas;
  }
}