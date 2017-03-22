import java.util.Scanner;

/**
 * Created by Balázs on 2017. 03. 22..
 */
// #29
// 10Write a program that reads a number from the standard input, then draws a
// diamond like this:
//
//
//    *
//   ***
//  *****
// *******
//  *****
//   ***
//    *
//
// The diamond should have as many lines as the number was
public class DrawDiamond {

  public static void main(String[] args) {

    Scanner myScanner = new Scanner(System.in);

    System.out.println("Number: ");
    int n1 = myScanner.nextInt();

    for (int i = 0; i < n1 / 2; i++) {

      for (int j = (n1 - 1) - i; j > 0; j--) {
        System.out.print(" ");
      }
      for (int k = (i * 2) + 1; k > 0; k--) {
        System.out.print("*");
      }

      System.out.println();
    }
    for (int i = n1 - 1; i > 0; i--) {

      for (int j = n1 - i; j > 0; j--) {
        System.out.print(" ");
      }
      for (int k = (i * 2) - 1; k > 0; k--) {
        System.out.print("*");
      }

      System.out.println();
    }
  }
}

