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
    int x = scanner.nextInt();
    System.out.println(sum(x));
  }

  public static int sum(int arg) {

    int summary = 0;
    for (int i = 0; i < arg; i++) {
      summary += i;
    }

    return summary;

  }
}

