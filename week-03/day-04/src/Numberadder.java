import java.util.Scanner;

/**
 * Created by Balázs on 2017. 03. 30..
 */
// Write a recursive function that takes one parameter: n and adds numbers from 1 to n.
public class Numberadder {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    System.out.println("Enter your number: ");
    int c = myScanner.nextInt();
    System.out.println("Numbers from 1 to " + c + ": " + adder(c));
   adder(c);
  }

  public static int adder(int n) {
    //System.out.println("Number: " + n);
    if (n <= 1) {
      return 1;
    } else {
      return n + adder(n - 1);
    }

  }

}
