/**
 * Created by Balázs on 2017. 03. 22..
 */
import java.util.Scanner;
public class AnimalsAndLegs {
  public static void main(String[] args) {
    // Write a program that asks for two integers
    // The first represents the number of chickens the farmer has
    // The seconf represents the number of pigs the farmer has
    // It should print how many legs all the animals have
    Scanner myScanner = new Scanner(System.in);

    System.out.println("Number of chikens? ");
    int chix = myScanner.nextInt();

    System.out.println("Number of pigs? ");
    int pigs = myScanner.nextInt();

    System.out.println("There are " + (chix * 2 + pigs * 4) + " legs in the farm.");
  }
}