/**
 * Created by Balázs on 2017. 04. 11..
 */
public class Pirate {

    String name;
    boolean hasWoodenLeg;
    int gold;

    public static String getName() {
      return name
    }

    public static boolean isHasWoodenLeg() {
      return hasWoodenLeg;
    }
    public  static int getGold() {
      return gold;
    }

    Pirate(String name, boolean hasWoodenLeg, int gold) {
      this.name = name;
      this.hasWoodenLeg = hasWoodenLeg;
      this.gold = gold;
    }
}
