//package main.java.music;

public abstract class StringedInstrument extends Instrument {
  int numberOfStrings;
  final String formatForPlay ="%s, a %d-stringed instrument that %s\n";

  public StringedInstrument(String name, String sound, int numberOfStrings) {
    super(name, sound);
    this.numberOfStrings = numberOfStrings;
  }
}
