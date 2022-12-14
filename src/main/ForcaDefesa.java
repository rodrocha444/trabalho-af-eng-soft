package main;

public abstract class ForcaDefesa {
  private int ataque;
  private int defesa;

  public ForcaDefesa(int ataque, int defesa) {
    this.defesa = defesa;
    this.ataque = ataque;
  }

  public int getDefesa() {
    return defesa;
  }

  public void setDefesa(int defesa) {
    this.defesa = defesa;
  }

  public int getAtaque() {
    return ataque;
  }

  public void setAtaque(int ataque) {
    this.ataque = ataque;
  }
}
