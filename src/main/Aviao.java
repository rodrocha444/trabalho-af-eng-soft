package main;

public class Aviao extends ForcaDefesa {
  private int vida;
  private int dinheiro;

  public Aviao(int ataque, int defesa, int vida, int dinheiro) {
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
    this.setAtaque(blindagem.getAtaque());
    this.setDefesa(blindagem.getDefesa());
  }

  void usarArma(Arma arma) {
    this.setAtaque(arma.getAtaque());
    this.setDefesa(arma.getDefesa());
  }

  void autoDestruir() {
    this.setVida(0);
  }
}