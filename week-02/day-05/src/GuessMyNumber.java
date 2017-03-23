/**
 * Created by Balázs on 2017. 03. 23..
 */

import java.util.Scanner;
import java.util.Random;

public class GuessMyNumber {
  public static void main(String[] args) {

    Scanner myScanner = new Scanner(System.in);
    System.out.println("Enter the range:");
    int rng = myScanner.nextInt();

    Random rand = new Random();
    int rn = rand.nextInt((rng) + 1);
    System.out.println(rn); // to be removed later

    for (int l = 5; l > 0; l--) {
      System.out.println("Count is: " + l); // to be removed later

      System.out.println("I've got a number between 1-100. You have " + l + " lives. Enter number: ");
      int n1 = myScanner.nextInt();

      if (n1 == rn) {
        System.out.println("Congratulations. You won!");
        return;
      }
      else if (n1 > rn)
        System.out.println("Too high.");
      else
        System.out.println("Too low.");

    }
  }
}
