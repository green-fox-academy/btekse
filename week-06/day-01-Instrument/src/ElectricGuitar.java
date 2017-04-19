//package main.java.music;

public class ElectricGuitar extends StringedInstrument {
  public ElectricGuitar(int numberOfStrings) {
    super("Electric Guitar", "Twang", numberOfStrings);
  }

  public ElectricGuitar() {
    this(6);
  }

  @Override
  public void play() {
    System.out.printf(formatForPlay, name, numberOfStrings, sound);
  }
}
