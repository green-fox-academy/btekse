import java.util.Scanner;

/**
 * Created by Balázs on 2017. 03. 23..
 */
// #4
// Create the usual class wrapper
//  and main method on your own.

// - Write a function called `sum` that sum all the numbers
//   until the given parameter
public class Sum {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter number: ");
    int scannedNumber = scanner.nextInt();
    System.out.println("The sum number is: " + sum(scannedNumber));
  }

  private static int sum(int sumTill) {
  int sum = 0;
  for (int i = 0; i <= sumTill; i++) {
    sum += i;
  }
  return sum;
  }
}
