package main.java.music;

public class Violin extends StringedInstrument {
  public Violin(int numberOfStrings) {
    super("Violin", "Screech", numberOfStrings);
  }

  public Violin() {
    this(4);
  }

  @Override
  public void play() {
    System.out.println(formatForPlay, name, numerOfStrings, sound);
  }
}
}
