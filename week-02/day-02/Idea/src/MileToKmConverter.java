/**
 * Created by Balázs on 2017. 03. 22..
 */
import java.util.Scanner;
public class MileToKmConverter {
  public static void main(String[] args) {
    // Write a program that asks for an integer that is a distance in kilometers,
    // then it converts that value to miles and prints it
    double kmToMiles = 0.621371;

    System.out.println("Please enter the distance in km: ");

    Scanner scanner = new Scanner(System.in);
      int km = scanner.nextInt();

    System.out.println("Your distance in miles: " + km * kmToMiles);
  }
}