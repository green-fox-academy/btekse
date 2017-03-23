import java.util.Scanner;

/**
 * Created by Balázs on 2017. 03. 23..
 */
//  #5
//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `factorio`
//   that returns it's input's factorial
public class Factorio {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter number: ");
    int x = scanner.nextInt();
    System.out.println(sum(x));
  }

  public static int sum(int input) {

    int summary = 1;
    for (int i = 1; i <= input; i++) {
      summary *= i;
      //summary 7 summary * i
    }
    return summary;
  }
}