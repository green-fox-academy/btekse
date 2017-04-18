package main.java.music;

public class BassGuitar extends StringedInstrument {
  public BassGuitar(int numberOfStrings) {
    super("bass guitar", "Duum-duum-duum", numberOfStrings);
  }

  public BassGuitar() {
    this(4);
  }

  @Override
  public void play() {
    System.out.println(formatForPlay, name, numerOfStrings, sound);
  }
}
