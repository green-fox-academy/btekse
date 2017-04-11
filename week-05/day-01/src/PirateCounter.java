import java.util.*;

public class PirateCounter{

  static class Pirate {

    String name;
    boolean hasWoodenLeg;
    int gold;

    Pirate(String name, boolean hasWoodenLeg, int gold) {
      this.name = name;
      this.hasWoodenLeg = hasWoodenLeg;
      this.gold = gold;
    }

    public String getName() { //getter Alt + Insert
      return name;
    }

    public boolean isHasWoodenLeg() { //getter Alt + Insert
      return hasWoodenLeg;
    }

    public int getGold() { //getter Alt + Insert
      return gold;
    }
  }

  public static void main(String... args){
    ArrayList<Pirate> pirates = new ArrayList<>();

    // Given this list...

    pirates.add(new Pirate("Olaf", false, 12));
    pirates.add(new Pirate("Uwe", true, 9));
    pirates.add(new Pirate("Jack", true, 16));
    pirates.add(new Pirate("Morgan", false, 17));
    pirates.add(new Pirate("Hook", true, 20));
    System.out.println(returnName(pirates));
    }

  private static List<String> returnName(List<Pirate> listOfPirates) { //method - 1. amit visszaad 2. amit bekér
    List<String> piratesName = new ArrayList<>(); //deklarálás
    for (int i = 0; i < listOfPirates.size(); i++) {
      if (listOfPirates.get(i).hasWoodenLeg && listOfPirates.get(i).getGold() > 15) {
        piratesName.add(listOfPirates.get(i).getName());

      }
    }
  return piratesName;
  }

  // Write a function that takes any list that contains pirates as in the example,
    // And returns a list of names containing the pirates that
    // - have wooden leg and
    // - have more than 15 gold
}
