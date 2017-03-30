import java.util.Scanner;

/**
 * Created by Balázs on 2017. 03. 30..
 */

// Given a non-negative int n, return the sum of its digits recursively (no loops).
// Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while
// divide (/) by 10 removes the rightmost digit (126 / 10 is 12).

public class Sumdigit {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    System.out.println("Enter your digits: ");
    int c = myScanner.nextInt();
    System.out.println("Sum of digits: " + sum(c));
    sum(c);
  }

  public static int sum(int n) {
    if (n <= 9 && n > 0) {
      return n;
    } else {
      return n % 10 + sum(n / 10);
    }

  }

}
