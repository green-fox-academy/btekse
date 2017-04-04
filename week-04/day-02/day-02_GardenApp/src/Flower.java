/**
 * Created by Balázs on 2017. 04. 04..
 */
public class Flower extends Plant {
  Flower(String color) {
    super(color, "flower", 5, 0.75, 0);
  }

    public static void main (String[] args) {
    Flower flowery = new Flower("yellow");
    Flower flowerb = new Flower("blue");
  }
}