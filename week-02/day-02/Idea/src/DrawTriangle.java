import java.util.Scanner;

/**
 * Created by Balázs on 2017. 03. 22..
 */
// #27
// Write a program that reads a number from the standard input, then draws a
// triangle like this:
//
// *
// **
// ***
// ****
//
// The triangle should have as many lines as the number was
public class DrawTriangle {
  public static void main(String[] args) {

    Scanner myScanner = new Scanner(System.in);

    System.out.println("Enter number: ");
    int n1 = myScanner.nextInt();

    for (int i = 1; i < n1 + 1; i++) {
      for (int j = 1; j < i + 1; j++) {
        System.out.print("*");
      }
      System.out.println("");
    }
  }
}
