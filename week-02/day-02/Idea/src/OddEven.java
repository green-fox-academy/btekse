/**
 * Created by Balázs on 2017. 03. 22..
 */

import java.util.Scanner;

public class OddEven {
  public static void main(String[] args) {

    // Write a program that reads a number form the standard input,
    // Than prints "Odd" if the number is odd, or "Even" it it is even.

    Scanner myScanner = new Scanner(System.in);

    System.out.println("Enter number: ");
    int a = myScanner.nextInt();

    if (a == 0) {
      System.out.println("Your number is zero.");
    } else if (a % 2 == 0) {
      System.out.println("Your number is even.");
    } else {
      System.out.println("Your number is odd.");
    }

  }
}
