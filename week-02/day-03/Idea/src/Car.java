/**
 * Created by Balázs on 2017. 07. 02..
 */
public class Car {
  public Car(String color, int price) {
    this.color = color;
    this.price = price;
  }

  public static void main(String[] args) {
  Car kocsi1 = new Car("red", 100);
  Car kocsi2 = new Car("yellow", 150);
    System.out.println("Kocsi1: " + kocsi1.toString());
    System.out.println("Kocsi2: " + kocsi2.toString());

  }

  @Override
  public String toString() {
    return "wheels number: " + wheel + " doors number: " + door + " color: " + color + " price: " + price;
  }

  static int wheel = 4;
  static int door = 5;
  String color;
  int price;


}
