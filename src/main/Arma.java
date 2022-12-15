package main;

public class Arma extends ForcaDefesa {
  Tipo tipo;
  String name;

  public static enum Tipo {
    METRALHADORA, MISSEL, BOMBA
  };

  public Arma(int ataque, int defesa, Tipo tipo, String name) {
    super(ataque, defesa);
    this.tipo = tipo;
    this.name = name;
  }

}
