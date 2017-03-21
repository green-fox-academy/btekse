/**
 * Created by Balázs on 2017. 03. 21..
 */

// Write a program that stores 3 sides of a cuboid as variables (doubles)
// The program should write the surface area and volume of the cuboid like:
//
// Surface Area: 600
// Volume: 1000

public class Cuboid {
  public static void main(String[] args) {

    double a = 20;

    System.out.println("Surface Area: " + (a * a * 6));
    System.out.println("Volume: " + (a * a * a));
  }
}
