package main;

public class Blindagem extends ForcaDefesa {
  String name;

  public Blindagem(int ataque, int defesa, String name) {
    super(ataque, defesa);
    this.name = name;
  }

}
