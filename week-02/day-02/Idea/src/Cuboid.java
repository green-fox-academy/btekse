// Write a program that stores 3 sides of a cuboid as variables (doubles)
// The program should write the surface area and volume of the cuboid like:
//
// Surface Area: 600
// Volume: 1000

public class Cuboid {
  public static void main(String[] args) {

    double a = 2;
    double b = 3;
    double c = 4;

    System.out.println("Surface Area: " + ((a * b) + (a * c) + (b * c)) * 2);
    System.out.println("Volume: " + (a * b * c));
  }
}
