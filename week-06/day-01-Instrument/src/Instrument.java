package main.java.music;

public abstract class Instrument {
  protected String name;
  protected String sound;

  public Instrument(String name, String sound) {
    this.name = name;
    this.sound = sound;
  }

  abstract void play(); //play method
}
